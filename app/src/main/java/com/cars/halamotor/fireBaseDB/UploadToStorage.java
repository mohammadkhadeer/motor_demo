package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.WheelsRimModel;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import java.io.File;
import java.util.ArrayList;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertNotificationTable;
import static com.cars.halamotor.fireBaseDB.FireBaseStoragePaths.carForSalePath;
import static com.cars.halamotor.fireBaseDB.UploadModelsToFireBase.addNewAccessories;
import static com.cars.halamotor.fireBaseDB.UploadModelsToFireBase.addNewCarPlates;
import static com.cars.halamotor.fireBaseDB.UploadModelsToFireBase.addNewItem;
import static com.cars.halamotor.fireBaseDB.UploadModelsToFireBase.addNewWheelsRim;
import static com.cars.halamotor.functions.Functions.getNotification;
import static com.cars.halamotor.functions.Functions.getTime;

public class UploadToStorage {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadCarForSaleModel(ArrayList<String> imagePaths, final CCEMT ccemt, String category
                                    , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });

            }
            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    ccemt.setImagePathArrayL(imagePathsInServer);
                    addNewItem(ccemt,"Car_For_Sale"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                            ("Car_For_Sale",ccemt.getCarMake() + " " +ccemt.getCarModel(),context,
                                    ccemt.getItemID(),"out","item")
                            ,getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewItem(ccemt,"Car_For_Sale"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                    ("Car_For_Sale",ccemt.getCarMake()
                            + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadCarForRentModel(ArrayList<String> imagePaths
            , final CCEMT ccemt, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    ccemt.setImagePathArrayL(imagePathsInServer);
                    addNewItem(ccemt,"Car_For_Rent"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                            ("Car_For_Rent",ccemt.getCarMake()
                                    + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewItem(ccemt,"Car_For_Rent"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                    ("Car_For_Rent",ccemt.getCarMake()
                            + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadCarForExchangeModel(ArrayList<String> imagePaths
            , final CCEMT ccemt, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    ccemt.setImagePathArrayL(imagePathsInServer);
                    addNewItem(ccemt,"Car_For_Exchange"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                            ("Car_For_Exchange",ccemt.getCarMake()
                                    + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewItem(ccemt,"Car_For_Exchange"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                    ("Car_For_Exchange",ccemt.getCarMake()
                            + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadCarForMotorcycleModel(ArrayList<String> imagePaths
            , final CCEMT ccemt, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    ccemt.setImagePathArrayL(imagePathsInServer);
                    addNewItem(ccemt,"Motorcycle"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                            ("Motorcycle",ccemt.getCarMake()
                                    + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewItem(ccemt,"Motorcycle"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                    ("Motorcycle",ccemt.getCarMake()
                            + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadCarForTrucksModel(ArrayList<String> imagePaths
            , final CCEMT ccemt, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    ccemt.setImagePathArrayL(imagePathsInServer);
                    addNewItem(ccemt,"Trucks"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                            ("Trucks",ccemt.getCarMake()
                                    + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewItem(ccemt,"Trucks"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                    ("Trucks",ccemt.getCarMake()
                            + " " +ccemt.getCarModel(),context,ccemt.getItemID(),"out","item"),getDataBaseInstance(context));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadCarPlatesModel(ArrayList<String> imagePaths
            , final CarPlatesModel carPlatesModel, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    carPlatesModel.setImagePathArrayL(imagePathsInServer);
                    addNewCarPlates(carPlatesModel,"Plates"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                            ("Plates",carPlatesModel.getCarPlatesCity()
                                    + " " +carPlatesModel.getCarPlatesNum(),context,carPlatesModel.getItemID(),"out","item")
                            ,getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewCarPlates(carPlatesModel,"Plates"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                            ("Plates",carPlatesModel.getCarPlatesCity()
                                    + " " +carPlatesModel.getCarPlatesNum(),context,carPlatesModel.getItemID(),"out","item")
                    ,getDataBaseInstance(context));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadWheelsRimModel(ArrayList<String> imagePaths
            , final WheelsRimModel wheelsRimModel, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    wheelsRimModel.setImagePathArrayL(imagePathsInServer);
                    addNewWheelsRim(wheelsRimModel,"Wheels_Rim"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                                    ("Wheels_Rim","Wheels_Rim"
                                            + " " +wheelsRimModel.getWheelSize(),context,wheelsRimModel.getItemID(),"out","item")
                            ,getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewWheelsRim(wheelsRimModel,"Wheels_Rim"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                            ("Wheels_Rim","Wheels_Rim"
                                    + " " +wheelsRimModel.getWheelSize(),context,wheelsRimModel.getItemID(),"out","item")
                    ,getDataBaseInstance(context));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadAccessoriesModel(ArrayList<String> imagePaths
            , final AccAndJunk accAndJunk, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    accAndJunk.setImagePathArrayL(imagePathsInServer);
                    addNewAccessories(accAndJunk,"Accessories"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                                    ("Accessories","Accessories"
                                            + " " +accAndJunk.getItemName(),context,accAndJunk.getItemID(),"out","item")
                            ,getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewAccessories(accAndJunk,"Accessories"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                            ("Accessories","Accessories"
                                    + " " +accAndJunk.getItemName(),context,accAndJunk.getItemID(),"out","item")
                    ,getDataBaseInstance(context));

        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uploadImagesBeforeUploadJunkCarModel(ArrayList<String> imagePaths
            , final AccAndJunk accAndJunk, String category
            , final String userIDOnServer, final int numberOfAds, final Context context) {
        //WE ADD timer cos no way to return imagePath after upload to server
        final ArrayList<String> imagePathsInServer = new ArrayList<String>();
        if (imagePaths.size() != 0)
        {
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
                                        imagePathsInServer.add(String.valueOf(uri));
                                    }
                                });
                            }

                        });
            }

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    accAndJunk.setImagePathArrayL(imagePathsInServer);
                    addNewAccessories(accAndJunk,"JunkCar"
                            ,userIDOnServer,numberOfAds);

                    insertNotificationTable(getNotification
                                    ("JunkCar","JunkCar"
                                            + " " +accAndJunk.getItemName(),context,accAndJunk.getItemID(),"out","item")
                            ,getDataBaseInstance(context));

                }
            }, 11000);
        }else{
            addNewAccessories(accAndJunk,"JunkCar"
                    ,userIDOnServer,numberOfAds);

            insertNotificationTable(getNotification
                            ("JunkCar","JunkCar"
                                    + " " +accAndJunk.getItemName(),context,accAndJunk.getItemID(),"out","item")
                    ,getDataBaseInstance(context));
        }
    }

}