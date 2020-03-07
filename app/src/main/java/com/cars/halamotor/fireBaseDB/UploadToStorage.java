package com.cars.halamotor.fireBaseDB;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.cars.halamotor.model.CCEMT;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import java.io.File;
import java.util.ArrayList;
import static com.cars.halamotor.fireBaseDB.FireBaseStoragePaths.carForSalePath;
import static com.cars.halamotor.fireBaseDB.UploadModelsToFireBase.addNewItem;
import static com.cars.halamotor.functions.Functions.getTime;

public class UploadToStorage {

    public static void uploadImages(ArrayList<String> imagePaths, final CCEMT ccemt, String category
                                    , final String userIDOnServer, final int numberOfAds) {
        //WE ADD timer becouse no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        for (int i=0;i<imagePaths.size();i++)
        {
            String imagePath = imagePaths.get(i);
            Uri imageUri = Uri.fromFile(new File(imagePath));

            final StorageReference storageReference = carForSalePath().child("image"+getTime()+String.valueOf(i));

            storageReference.putFile(imageUri).addOnSuccessListener
                    (new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    Log.i("TAG",String.valueOf(uri));
                                    imagePathsInServer.add(String.valueOf(uri));
                                }
                            });
                        }

                    });

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i("TAG","here on timer");
                ccemt.setImagePathArrayL(imagePathsInServer);
                addNewItem(ccemt,"Car_For_Sale"
                        ,userIDOnServer,numberOfAds);

            }
        }, 15000);

    }
}