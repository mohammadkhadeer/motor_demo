package com.cars.halamotor.functions;

import android.content.Context;

import com.cars.halamotor.R;

import java.util.ArrayList;

public class FillCarModel {

    public static ArrayList<String> fillCarMakeArrayL(ArrayList<String> carModelArrayList, Context context,String carMake) {
        carModelArrayList = new ArrayList<String>();

        if (carMake.equals(context.getString(R.string.hyundai)))
        {
            carModelArrayList.add(context.getString(R.string.h_1_starex));
            carModelArrayList.add(context.getString(R.string.i_10));
            carModelArrayList.add(context.getString(R.string.i_20));
            carModelArrayList.add(context.getString(R.string.i_30));
            carModelArrayList.add(context.getString(R.string.i_40));
            carModelArrayList.add(context.getString(R.string.atos));
            carModelArrayList.add(context.getString(R.string.azera));
            carModelArrayList.add(context.getString(R.string.accent));
            carModelArrayList.add(context.getString(R.string.h_100));
            carModelArrayList.add(context.getString(R.string.excel));
            carModelArrayList.add(context.getString(R.string.elantra));
            carModelArrayList.add(context.getString(R.string.avante));
            carModelArrayList.add(context.getString(R.string.equus));
            carModelArrayList.add(context.getString(R.string.ioniq));
            carModelArrayList.add(context.getString(R.string.porter));
            carModelArrayList.add(context.getString(R.string.pony));
            carModelArrayList.add(context.getString(R.string.trajet));
            carModelArrayList.add(context.getString(R.string.tuscani));
            carModelArrayList.add(context.getString(R.string.terracan));
            carModelArrayList.add(context.getString(R.string.tiburon));
            carModelArrayList.add(context.getString(R.string.galloper));
            carModelArrayList.add(context.getString(R.string.getz));
            carModelArrayList.add(context.getString(R.string.genesis));
            carModelArrayList.add(context.getString(R.string.genesis_coupe));
            carModelArrayList.add(context.getString(R.string.santamo));
            carModelArrayList.add(context.getString(R.string.stellar));
            carModelArrayList.add(context.getString(R.string.scoupe));
            carModelArrayList.add(context.getString(R.string.santa_fe));
            carModelArrayList.add(context.getString(R.string.centennial));
            carModelArrayList.add(context.getString(R.string.sonata));
            carModelArrayList.add(context.getString(R.string.veloster));
            carModelArrayList.add(context.getString(R.string.veracruz));
            carModelArrayList.add(context.getString(R.string.verna));
            carModelArrayList.add(context.getString(R.string.creta));
            carModelArrayList.add(context.getString(R.string.coupe));
            carModelArrayList.add(context.getString(R.string.matrix));
            carModelArrayList.add(context.getString(R.string.mighty));
            carModelArrayList.add(context.getString(R.string.kona));
            carModelArrayList.add(context.getString(R.string.eon));
            carModelArrayList.add(context.getString(R.string.palisade));
            carModelArrayList.add(context.getString(R.string.click));
            carModelArrayList.add(context.getString(R.string.entourage));
            carModelArrayList.add(context.getString(R.string.county));
        }

        if (carMake.equals(context.getString(R.string.toyota)))
        {
            carModelArrayList.add(context.getString(R.string.toyota_4runner));
            carModelArrayList.add(context.getString(R.string.toyota_c_hr));
            carModelArrayList.add(context.getString(R.string.toyota_mr2));
            carModelArrayList.add(context.getString(R.string.toyota_iq));
            carModelArrayList.add(context.getString(R.string.toyota_avalon));
            carModelArrayList.add(context.getString(R.string.toyota_avanza));
            carModelArrayList.add(context.getString(R.string.toyota_avensis));
            carModelArrayList.add(context.getString(R.string.toyota_alphard));
            carModelArrayList.add(context.getString(R.string.toyota_allex));
            carModelArrayList.add(context.getString(R.string.toyota_opa));
            carModelArrayList.add(context.getString(R.string.toyota_auris));
            carModelArrayList.add(context.getString(R.string.toyota_echo));
            carModelArrayList.add(context.getString(R.string.toyota_innova));
            carModelArrayList.add(context.getString(R.string.toyota_aristo));
            carModelArrayList.add(context.getString(R.string.toyota_fj_cruiser));
            carModelArrayList.add(context.getString(R.string.toyota_mark_x));
            carModelArrayList.add(context.getString(R.string.toyota_altezza));
            carModelArrayList.add(context.getString(R.string.toyota_allion));
            carModelArrayList.add(context.getString(R.string.toyota_urban_cruiser));
            carModelArrayList.add(context.getString(R.string.toyota_orgin));
            carModelArrayList.add(context.getString(R.string.toyota_aurion));
            carModelArrayList.add(context.getString(R.string.toyota_ipsum));
            carModelArrayList.add(context.getString(R.string.toyota_aygo));
            carModelArrayList.add(context.getString(R.string.toyota_passo));
            carModelArrayList.add(context.getString(R.string.toyota_paseo));
            carModelArrayList.add(context.getString(R.string.toyota_prado));
            carModelArrayList.add(context.getString(R.string.toyota_probox));
            carModelArrayList.add(context.getString(R.string.toyota_progres));
            carModelArrayList.add(context.getString(R.string.toyota_pronard));
            carModelArrayList.add(context.getString(R.string.toyota_previa));
            carModelArrayList.add(context.getString(R.string.toyota_premio));
            carModelArrayList.add(context.getString(R.string.toyota_prius));
            carModelArrayList.add(context.getString(R.string.toyota_prius_c));
            carModelArrayList.add(context.getString(R.string.toyota_blade));
            carModelArrayList.add(context.getString(R.string.toyota_blizzard));
            carModelArrayList.add(context.getString(R.string.toyota_porte));
            carModelArrayList.add(context.getString(R.string.toyota_bb));
            carModelArrayList.add(context.getString(R.string.toyota_picnic));
            carModelArrayList.add(context.getString(R.string.toyota_tacoma));
            carModelArrayList.add(context.getString(R.string.toyota_townace));
            carModelArrayList.add(context.getString(R.string.toyota_chaser));
            carModelArrayList.add(context.getString(R.string.toyota_tundra));
            carModelArrayList.add(context.getString(R.string.toyota_tercel));
            carModelArrayList.add(context.getString(R.string.toyota_grand_hiace));
            carModelArrayList.add(context.getString(R.string.toyota_gt_86));
            carModelArrayList.add(context.getString(R.string.toyota_duet));
            carModelArrayList.add(context.getString(R.string.toyota_dyna));
            carModelArrayList.add(context.getString(R.string.toyota_rav_4));
            carModelArrayList.add(context.getString(R.string.toyota_ractis));
            carModelArrayList.add(context.getString(R.string.toyota_raum));
            carModelArrayList.add(context.getString(R.string.toyota_rush));
            carModelArrayList.add(context.getString(R.string.toyota_regius));
            carModelArrayList.add(context.getString(R.string.toyota_zelas));
            carModelArrayList.add(context.getString(R.string.toyota_sparky));
            carModelArrayList.add(context.getString(R.string.toyota_sprinter));
            carModelArrayList.add(context.getString(R.string.toyota_starlet));
            carModelArrayList.add(context.getString(R.string.toyota_succeed));
            carModelArrayList.add(context.getString(R.string.toyota_scepter));
            carModelArrayList.add(context.getString(R.string.toyota_supra));
            carModelArrayList.add(context.getString(R.string.toyota_soarer));
            carModelArrayList.add(context.getString(R.string.toyota_soluna));
            carModelArrayList.add(context.getString(R.string.toyota_sera));
            carModelArrayList.add(context.getString(R.string.toyota_sequoia));
            carModelArrayList.add(context.getString(R.string.toyota_celsior));
            carModelArrayList.add(context.getString(R.string.toyota_celsior));
            carModelArrayList.add(context.getString(R.string.toyota_sequoia));
            carModelArrayList.add(context.getString(R.string.toyota_celsior));
            carModelArrayList.add(context.getString(R.string.toyota_celica));
            carModelArrayList.add(context.getString(R.string.toyota_sienta));
            carModelArrayList.add(context.getString(R.string.toyota_scion));
            carModelArrayList.add(context.getString(R.string.toyota_sienna));
            carModelArrayList.add(context.getString(R.string.toyota_land_cruiser_pickup));
            carModelArrayList.add(context.getString(R.string.toyota_gaia));
            carModelArrayList.add(context.getString(R.string.toyota_granvia));
            carModelArrayList.add(context.getString(R.string.toyota_vellfire));
            carModelArrayList.add(context.getString(R.string.toyota_venza));
            carModelArrayList.add(context.getString(R.string.toyota_fun_cargo));
            carModelArrayList.add(context.getString(R.string.toyota_fortuner));
            carModelArrayList.add(context.getString(R.string.toyota_voxy));
            carModelArrayList.add(context.getString(R.string.toyota_voltz));
            carModelArrayList.add(context.getString(R.string.toyota_verso));
            carModelArrayList.add(context.getString(R.string.toyota_carina));
            carModelArrayList.add(context.getString(R.string.toyota_cavalier));
            carModelArrayList.add(context.getString(R.string.toyota_caldina));
            carModelArrayList.add(context.getString(R.string.toyota_camry));
            carModelArrayList.add(context.getString(R.string.toyota_cami));
            carModelArrayList.add(context.getString(R.string.toyota_crown));
            carModelArrayList.add(context.getString(R.string.toyota_cressida));
            carModelArrayList.add(context.getString(R.string.toyota_corolla));
            carModelArrayList.add(context.getString(R.string.toyota_Corona));
            carModelArrayList.add(context.getString(R.string.toyota_coaster));
            carModelArrayList.add(context.getString(R.string.toyota_land_cruiser));
            carModelArrayList.add(context.getString(R.string.toyota_land_cruiser_j70));
            carModelArrayList.add(context.getString(R.string.toyota_liteAce));
            carModelArrayList.add(context.getString(R.string.toyota_matrix));
            carModelArrayList.add(context.getString(R.string.toyota_mark_2));
            carModelArrayList.add(context.getString(R.string.toyota_master_ace));
            carModelArrayList.add(context.getString(R.string.toyota_mega_cruiser));
            carModelArrayList.add(context.getString(R.string.toyota_harrier));
            carModelArrayList.add(context.getString(R.string.toyota_hiace));
            carModelArrayList.add(context.getString(R.string.toyota_highlander));
            carModelArrayList.add(context.getString(R.string.toyota_hilux));
            carModelArrayList.add(context.getString(R.string.toyota_wish));
            carModelArrayList.add(context.getString(R.string.toyota_will));
            carModelArrayList.add(context.getString(R.string.toyota_windom));
            carModelArrayList.add(context.getString(R.string.toyota_yaris));
            carModelArrayList.add(context.getString(R.string.toyota_2000_gt));
            carModelArrayList.add(context.getString(R.string.toyota_ai_300));
            carModelArrayList.add(context.getString(R.string.toyota_axio));
            carModelArrayList.add(context.getString(R.string.toyota_celstar));
            carModelArrayList.add(context.getString(R.string.toyota_corolla));
            carModelArrayList.add(context.getString(R.string.toyota_fielder));
            carModelArrayList.add(context.getString(R.string.toyota_noah));
            carModelArrayList.add(context.getString(R.string.toyota_rumion));
            carModelArrayList.add(context.getString(R.string.toyota_runx));
            carModelArrayList.add(context.getString(R.string.toyota_solara));
            carModelArrayList.add(context.getString(R.string.toyota_sprinter_carib));
            carModelArrayList.add(context.getString(R.string.toyota_vanguard));
            carModelArrayList.add(context.getString(R.string.toyota_verossa));
        }

            return carModelArrayList;
    }

}
