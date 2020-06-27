package com.cars.halamotor.functions;

import android.content.Context;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarMake;
import com.cars.halamotor.model.ItemFilterModel;

import java.util.ArrayList;

public class FillCarMakeArrayListsInCarDerails {

    public static ArrayList<CarMake> fillCarMakeArrayL(ArrayList<CarMake> carMakeArrayList, Context context) {
        carMakeArrayList = new ArrayList<CarMake>();

        CarMake carMake1 = new CarMake(R.drawable.hyundai,context.getResources().getString(R.string.hyundai),context.getResources().getString(R.string.hyundai_s));
        CarMake carMake2 = new CarMake(R.drawable.toyota,context.getResources().getString(R.string.toyota),context.getResources().getString(R.string.toyota_s));
        CarMake carMake3 = new CarMake(R.drawable.kia,context.getResources().getString(R.string.kia),context.getResources().getString(R.string.kia_s));
        CarMake carMake4 = new CarMake(R.drawable.bmw,context.getResources().getString(R.string.bmw),context.getResources().getString(R.string.bmw_s));
        CarMake carMake5 = new CarMake(R.drawable.mercedes_benz,context.getResources().getString(R.string.mercedes_benz),context.getResources().getString(R.string.mercedes_benz_s));
        CarMake carMake6 = new CarMake(R.drawable.aston_martin,context.getResources().getString(R.string.aston_martin),context.getResources().getString(R.string.aston_martin_s));
        CarMake carMake7 = new CarMake(R.drawable.alfa_romeo,context.getResources().getString(R.string.alfa_romeo),context.getResources().getString(R.string.alfa_romeo_s));
        CarMake carMake8 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.audi),context.getResources().getString(R.string.audi_s));
        CarMake carMake9 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.isuzu),context.getResources().getString(R.string.isuzu));

        CarMake carMake10 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.infiniti),context.getResources().getString(R.string.infiniti));
        CarMake carMake11= new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.opel),context.getResources().getString(R.string.opel_s));
        CarMake carMake12 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.bentley),context.getResources().getString(R.string.bentley_s));
        CarMake carMake13 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.porsche),context.getResources().getString(R.string.porsche_s));
        CarMake carMake14 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.pontiac),context.getResources().getString(R.string.pontiac_s));
        CarMake carMake16 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.peugeot),context.getResources().getString(R.string.peugeot_s));
        CarMake carMake17 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.jaguar),context.getResources().getString(R.string.jaguar_s));
        CarMake carMake18 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.great_wall),context.getResources().getString(R.string.great_wall_s));
        CarMake carMake19 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.gmc),context.getResources().getString(R.string.gmc_s));
        CarMake carMake20 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.jeep),context.getResources().getString(R.string.jeep_s));

        CarMake carMake21 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.daihatsu),context.getResources().getString(R.string.daihatsu_s));
        CarMake carMake22 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.daewoo),context.getResources().getString(R.string.daewoo_s));
        CarMake carMake23 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.dodge),context.getResources().getString(R.string.dodge_s));
        CarMake carMake24 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.rover),context.getResources().getString(R.string.rover_s));
        CarMake carMake25 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.rolls_royce),context.getResources().getString(R.string.rolls_royce_s));
        CarMake carMake26 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.renault),context.getResources().getString(R.string.renault_s));
        CarMake carMake27 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.saab),context.getResources().getString(R.string.saab_s));
        CarMake carMake28 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.saturn),context.getResources().getString(R.string.saturn_s));
        CarMake carMake29 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.ssang_yong),context.getResources().getString(R.string.ssang_yong_s));
        CarMake carMake30 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.citroen),context.getResources().getString(R.string.citroen_s));

        CarMake carMake31 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.skoda),context.getResources().getString(R.string.skoda_s));
        CarMake carMake32 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.subaru),context.getResources().getString(R.string.subaru_s));
        CarMake carMake33 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.suzuki),context.getResources().getString(R.string.suzuki_s));
        CarMake carMake34 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.seat),context.getResources().getString(R.string.seat_s));
        CarMake carMake35 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.chery),context.getResources().getString(R.string.chery_s));
        CarMake carMake36 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.chevrolat),context.getResources().getString(R.string.chevrolat_s));
        CarMake carMake37 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.ford),context.getResources().getString(R.string.ford_s));
        CarMake carMake38 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.volvo),context.getResources().getString(R.string.volvo_s));
        CarMake carMake39 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.volkswagen),context.getResources().getString(R.string.volkswagen_s));
        CarMake carMake40 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.fiat),context.getResources().getString(R.string.fiat_s));

        CarMake carMake41 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.ferrari),context.getResources().getString(R.string.ferrari_s));
        CarMake carMake42 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.cadillac),context.getResources().getString(R.string.cadillac_s));
        CarMake carMake43 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.chrysler),context.getResources().getString(R.string.chrysler_s));
        CarMake carMake44 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.lada),context.getResources().getString(R.string.lada_s));
        CarMake carMake45 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.lamborghini),context.getResources().getString(R.string.lamborghini_s));
        CarMake carMake46 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.land_rover),context.getResources().getString(R.string.land_rover_s));
        CarMake carMake47 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.lexus),context.getResources().getString(R.string.lexus_s));
        CarMake carMake48 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.lotus),context.getResources().getString(R.string.lotus_s));
        CarMake carMake49 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.lincoln),context.getResources().getString(R.string.lincoln_s));
        CarMake carMake50 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.mazda),context.getResources().getString(R.string.mazda_s));

        CarMake carMake51 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.maserati),context.getResources().getString(R.string.maserati_s));
        CarMake carMake52 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.morgan),context.getResources().getString(R.string.morgan_s));
        CarMake carMake53 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.mitsubishi),context.getResources().getString(R.string.mitsubishi_s));
        CarMake carMake54 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.mercury),context.getResources().getString(R.string.mercury_s));
        CarMake carMake55 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.mini),context.getResources().getString(R.string.mini_s));
        CarMake carMake56 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.nissan),context.getResources().getString(R.string.nissan_s));
        CarMake carMake57 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.hummer),context.getResources().getString(R.string.hummer_s));
        CarMake carMake58 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.honda),context.getResources().getString(R.string.honda_s));
        CarMake carMake59 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.geely),context.getResources().getString(R.string.geely_s));
        CarMake carMake60 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.zxauto),context.getResources().getString(R.string.zxauto_s));

        CarMake carMake61 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.mg),context.getResources().getString(R.string.mg_s));
        CarMake carMake62 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.proton),context.getResources().getString(R.string.proton_s));
        CarMake carMake63 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.brilliance),context.getResources().getString(R.string.brilliance_s));
        CarMake carMake64 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.byd),context.getResources().getString(R.string.byd_s));
        CarMake carMake65 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.samsung),context.getResources().getString(R.string.samsung_s));
        CarMake carMake66 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.tesla),context.getResources().getString(R.string.tesla_s));
        CarMake carMake67 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.iran_khodro),context.getResources().getString(R.string.iran_khodro_s));
        CarMake carMake68 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.tata),context.getResources().getString(R.string.tata_s));
        CarMake carMake69 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.bugatti),context.getResources().getString(R.string.bugatti_s));
        CarMake carMake70 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.buick),context.getResources().getString(R.string.buick_s));

        CarMake carMake71 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.acura),context.getResources().getString(R.string.acura_s));
        CarMake carMake72 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.scion),context.getResources().getString(R.string.scion_s));
        CarMake carMake73 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.mclaren),context.getResources().getString(R.string.mclaren_s));
        CarMake carMake74 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.pagani),context.getResources().getString(R.string.pagani_s));
        CarMake carMake75 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.lancia),context.getResources().getString(R.string.lancia_s));
        CarMake carMake76 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.jac),context.getResources().getString(R.string.jac_s));
        CarMake carMake77 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.lifan),context.getResources().getString(R.string.lifan_s));
        CarMake carMake78 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.faw),context.getResources().getString(R.string.faw_s));
        CarMake carMake79 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.foton),context.getResources().getString(R.string.foton_s));
        CarMake carMake80 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.maruti_suzuki),context.getResources().getString(R.string.maruti_suzuki_s));

        CarMake carMake81 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.saipa),context.getResources().getString(R.string.saipa_s));
        CarMake carMake82 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.private_type),context.getResources().getString(R.string.private_type_s));
        CarMake carMake83 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.baic),context.getResources().getString(R.string.baic_s));
        CarMake carMake84 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.changan),context.getResources().getString(R.string.changan_s));
        CarMake carMake85 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.hunaghai),context.getResources().getString(R.string.hunaghai_s));
        CarMake carMake86 = new CarMake(R.drawable.car_for_sale,context.getResources().getString(R.string.dfm),context.getResources().getString(R.string.dfm_s));

        carMakeArrayList.add(carMake1);
        carMakeArrayList.add(carMake2);
        carMakeArrayList.add(carMake3);
        carMakeArrayList.add(carMake4);
        carMakeArrayList.add(carMake5);
        carMakeArrayList.add(carMake6);
        carMakeArrayList.add(carMake7);
        carMakeArrayList.add(carMake8);
        carMakeArrayList.add(carMake9);
        carMakeArrayList.add(carMake10);

        carMakeArrayList.add(carMake11);
        carMakeArrayList.add(carMake12);
        carMakeArrayList.add(carMake13);
        carMakeArrayList.add(carMake14);
        carMakeArrayList.add(carMake16);
        carMakeArrayList.add(carMake17);
        carMakeArrayList.add(carMake18);
        carMakeArrayList.add(carMake19);
        carMakeArrayList.add(carMake20);
        carMakeArrayList.add(carMake21);

        carMakeArrayList.add(carMake22);
        carMakeArrayList.add(carMake23);
        carMakeArrayList.add(carMake24);
        carMakeArrayList.add(carMake25);
        carMakeArrayList.add(carMake26);
        carMakeArrayList.add(carMake27);
        carMakeArrayList.add(carMake28);
        carMakeArrayList.add(carMake29);
        carMakeArrayList.add(carMake30);
        carMakeArrayList.add(carMake31);

        carMakeArrayList.add(carMake32);
        carMakeArrayList.add(carMake33);
        carMakeArrayList.add(carMake34);
        carMakeArrayList.add(carMake35);
        carMakeArrayList.add(carMake36);
        carMakeArrayList.add(carMake37);
        carMakeArrayList.add(carMake38);
        carMakeArrayList.add(carMake39);
        carMakeArrayList.add(carMake40);
        carMakeArrayList.add(carMake41);

        carMakeArrayList.add(carMake42);
        carMakeArrayList.add(carMake43);
        carMakeArrayList.add(carMake44);
        carMakeArrayList.add(carMake45);
        carMakeArrayList.add(carMake46);
        carMakeArrayList.add(carMake47);
        carMakeArrayList.add(carMake48);
        carMakeArrayList.add(carMake49);
        carMakeArrayList.add(carMake50);
        carMakeArrayList.add(carMake51);

        carMakeArrayList.add(carMake52);
        carMakeArrayList.add(carMake53);
        carMakeArrayList.add(carMake54);
        carMakeArrayList.add(carMake55);
        carMakeArrayList.add(carMake56);
        carMakeArrayList.add(carMake57);
        carMakeArrayList.add(carMake58);
        carMakeArrayList.add(carMake59);
        carMakeArrayList.add(carMake60);
        carMakeArrayList.add(carMake61);

        carMakeArrayList.add(carMake62);
        carMakeArrayList.add(carMake63);
        carMakeArrayList.add(carMake64);
        carMakeArrayList.add(carMake65);
        carMakeArrayList.add(carMake66);
        carMakeArrayList.add(carMake67);
        carMakeArrayList.add(carMake68);
        carMakeArrayList.add(carMake69);
        carMakeArrayList.add(carMake70);
        carMakeArrayList.add(carMake71);

        carMakeArrayList.add(carMake72);
        carMakeArrayList.add(carMake73);
        carMakeArrayList.add(carMake74);
        carMakeArrayList.add(carMake75);
        carMakeArrayList.add(carMake76);
        carMakeArrayList.add(carMake77);
        carMakeArrayList.add(carMake78);
        carMakeArrayList.add(carMake79);
        carMakeArrayList.add(carMake80);
        carMakeArrayList.add(carMake81);

        carMakeArrayList.add(carMake82);
        carMakeArrayList.add(carMake83);
        carMakeArrayList.add(carMake84);
        carMakeArrayList.add(carMake85);
        carMakeArrayList.add(carMake86);

        return carMakeArrayList;
    }

    public static ArrayList<ItemFilterModel> fillCarMakeArrayL(Context context) {
        ArrayList<ItemFilterModel>carMakeFilterArrayList = new ArrayList<ItemFilterModel>();

        ArrayList<CarMake>carMakeArrayList = new ArrayList<CarMake>();
        carMakeArrayList = fillCarMakeArrayL(carMakeArrayList,context);

        for (int i = 0;i<carMakeArrayList.size();i++)
        {
            ItemFilterModel itemFilterModel = new ItemFilterModel(
                    carMakeArrayList.get(i).getMakeStr()
                    ,carMakeArrayList.get(i).getMakeStrS()
            );
            carMakeFilterArrayList.add(itemFilterModel);
        }
        return carMakeFilterArrayList;
    }

}
