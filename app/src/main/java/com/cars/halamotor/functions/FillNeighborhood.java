package com.cars.halamotor.functions;

import android.content.Context;

import com.cars.halamotor.R;
import com.cars.halamotor.model.Neighborhood;

import java.util.ArrayList;

public class FillNeighborhood {
    public static ArrayList<Neighborhood> fillNeighborhoodArrayL(ArrayList<Neighborhood> neighborhoodArrayL, Context context, String city) {

        neighborhoodArrayL = new ArrayList<Neighborhood>();

        if (city.equals("dubai"))
        {
            Neighborhood subFavorite1 = new Neighborhood(context.getResources().getString(R.string.dubai_acacia));
            Neighborhood subFavorite2 = new Neighborhood(context.getResources().getString(R.string.dubai_academic));
            Neighborhood subFavorite3 = new Neighborhood(context.getResources().getString(R.string.dubai_alaweer));
            Neighborhood subFavorite4 = new Neighborhood(context.getResources().getString(R.string.dubai_albadaa));
            Neighborhood subFavorite5 = new Neighborhood(context.getResources().getString(R.string.dubai_albarari));
            Neighborhood subFavorite6 = new Neighborhood(context.getResources().getString(R.string.dubai_albarsha));
            Neighborhood subFavorite7 = new Neighborhood(context.getResources().getString(R.string.dubai_al_furjan));
            Neighborhood subFavorite8 = new Neighborhood(context.getResources().getString(R.string.dubai_al_garhoud));
            Neighborhood subFavorite9 = new Neighborhood(context.getResources().getString(R.string.dubai_al_hamriya));

            Neighborhood subFavorite10 = new Neighborhood(context.getResources().getString(R.string.dubai_al_jaddaf));
            Neighborhood subFavorite11 = new Neighborhood(context.getResources().getString(R.string.dubai_al_jafiliya));
            Neighborhood subFavorite12 = new Neighborhood(context.getResources().getString(R.string.dubai_al_khawaneej));
            Neighborhood subFavorite13 = new Neighborhood(context.getResources().getString(R.string.dubai_al_mizhar));
            Neighborhood subFavorite14 = new Neighborhood(context.getResources().getString(R.string.dubai_al_muhaisnah));
            Neighborhood subFavorite15 = new Neighborhood(context.getResources().getString(R.string.dubai_al_nahda));
            Neighborhood subFavorite16 = new Neighborhood(context.getResources().getString(R.string.dubai_al_quoz));
            Neighborhood subFavorite17 = new Neighborhood(context.getResources().getString(R.string.dubai_al_qusais));
            Neighborhood subFavorite18 = new Neighborhood(context.getResources().getString(R.string.dubai_al_rashidiya));
            Neighborhood subFavorite19 = new Neighborhood(context.getResources().getString(R.string.dubai_al_safa));

            Neighborhood subFavorite20 = new Neighborhood(context.getResources().getString(R.string.dubai_al_satwa));
            Neighborhood subFavorite21 = new Neighborhood(context.getResources().getString(R.string.dubai_al_shindagah));
            Neighborhood subFavorite22 = new Neighborhood(context.getResources().getString(R.string.dubai_al_sufouh));
            Neighborhood subFavorite23 = new Neighborhood(context.getResources().getString(R.string.dubai_al_twar));
            Neighborhood subFavorite24 = new Neighborhood(context.getResources().getString(R.string.dubai_al_warqaa));
            Neighborhood subFavorite25 = new Neighborhood(context.getResources().getString(R.string.dubai_al_warsan));
            Neighborhood subFavorite26 = new Neighborhood(context.getResources().getString(R.string.dubai_al_wasl));
            Neighborhood subFavorite27 = new Neighborhood(context.getResources().getString(R.string.dubai_arabian_ranches));
            Neighborhood subFavorite28 = new Neighborhood(context.getResources().getString(R.string.dubai_bur_dubai));
            Neighborhood subFavorite29 = new Neighborhood(context.getResources().getString(R.string.dubai_business_bay));

            Neighborhood subFavorite30 = new Neighborhood(context.getResources().getString(R.string.dubai_culture_village));
            Neighborhood subFavorite31 = new Neighborhood(context.getResources().getString(R.string.dubai_deira));
            Neighborhood subFavorite32 = new Neighborhood(context.getResources().getString(R.string.dubai_difc));
            Neighborhood subFavorite33 = new Neighborhood(context.getResources().getString(R.string.dubai_discovery_gardens));
            Neighborhood subFavorite34 = new Neighborhood(context.getResources().getString(R.string.dubai_downtown_dubai));
            Neighborhood subFavorite35 = new Neighborhood(context.getResources().getString(R.string.dubai_downtown_jebel_ali));
            Neighborhood subFavorite36 = new Neighborhood(context.getResources().getString(R.string.dubai_design_district));
            Neighborhood subFavorite37 = new Neighborhood(context.getResources().getString(R.string.dubai_festival_city));
            Neighborhood subFavorite38 = new Neighborhood(context.getResources().getString(R.string.dubai_healthcare_city));
            Neighborhood subFavorite39 = new Neighborhood(context.getResources().getString(R.string.dubai_hills_estate));

            Neighborhood subFavorite40 = new Neighborhood(context.getResources().getString(R.string.dubai_industrial_city));
            Neighborhood subFavorite41 = new Neighborhood(context.getResources().getString(R.string.dubai_international_city));
            Neighborhood subFavorite42 = new Neighborhood(context.getResources().getString(R.string.dubai_investment_park));
            Neighborhood subFavorite43 = new Neighborhood(context.getResources().getString(R.string.dubai_land));
            Neighborhood subFavorite44 = new Neighborhood(context.getResources().getString(R.string.dubai_marina));
            Neighborhood subFavorite45 = new Neighborhood(context.getResources().getString(R.string.dubai_media_city));
            Neighborhood subFavorite46 = new Neighborhood(context.getResources().getString(R.string.dubai_pearl));
            Neighborhood subFavorite47 = new Neighborhood(context.getResources().getString(R.string.dubai_promenade));
            Neighborhood subFavorite48 = new Neighborhood(context.getResources().getString(R.string.dubai_silicon_oasis));
            Neighborhood subFavorite49 = new Neighborhood(context.getResources().getString(R.string.dubai_sports_city));

            Neighborhood subFavorite50 = new Neighborhood(context.getResources().getString(R.string.dubai_studio_city));
            Neighborhood subFavorite51 = new Neighborhood(context.getResources().getString(R.string.dubai_waterfront));
            Neighborhood subFavorite52 = new Neighborhood(context.getResources().getString(R.string.dubai_world_central));
            Neighborhood subFavorite53 = new Neighborhood(context.getResources().getString(R.string.dubai_du_biotech));
            Neighborhood subFavorite54 = new Neighborhood(context.getResources().getString(R.string.dubai_emirates_golf_club));
            Neighborhood subFavorite55 = new Neighborhood(context.getResources().getString(R.string.dubai_emirates_hills));
            Neighborhood subFavorite56 = new Neighborhood(context.getResources().getString(R.string.dubai_global_village));
            Neighborhood subFavorite57 = new Neighborhood(context.getResources().getString(R.string.dubai_green_community));
            Neighborhood subFavorite58 = new Neighborhood(context.getResources().getString(R.string.dubai_greens));
            Neighborhood subFavorite59 = new Neighborhood(context.getResources().getString(R.string.dubai_hatta));

            Neighborhood subFavorite60 = new Neighborhood(context.getResources().getString(R.string.dubai_impz));
            Neighborhood subFavorite61 = new Neighborhood(context.getResources().getString(R.string.dubai_jebel_ali));
            Neighborhood subFavorite62 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah));
            Neighborhood subFavorite63 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_beach_residence));
            Neighborhood subFavorite64 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_golf_estates));
            Neighborhood subFavorite65 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_heights));
            Neighborhood subFavorite66 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_islands));
            Neighborhood subFavorite67 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_lake_towers));
            Neighborhood subFavorite68 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_park));
            Neighborhood subFavorite69 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_village_circle));

            Neighborhood subFavorite70 = new Neighborhood(context.getResources().getString(R.string.dubai_jumeirah_village_triangle));
            Neighborhood subFavorite71 = new Neighborhood(context.getResources().getString(R.string.dubai_karama));
            Neighborhood subFavorite72 = new Neighborhood(context.getResources().getString(R.string.dubai_maritime_city));
            Neighborhood subFavorite73 = new Neighborhood(context.getResources().getString(R.string.dubai_meadows));
            Neighborhood subFavorite74 = new Neighborhood(context.getResources().getString(R.string.dubai_meydan_avenue));
            Neighborhood subFavorite75 = new Neighborhood(context.getResources().getString(R.string.dubai_meydan_gated_community));
            Neighborhood subFavorite76 = new Neighborhood(context.getResources().getString(R.string.dubai_mina_al_arab));
            Neighborhood subFavorite77 = new Neighborhood(context.getResources().getString(R.string.dubai_mirdif));
            Neighborhood subFavorite78 = new Neighborhood(context.getResources().getString(R.string.dubai_mohammad_bin_tashid_city));
            Neighborhood subFavorite79 = new Neighborhood(context.getResources().getString(R.string.dubai_motor_city));

            Neighborhood subFavorite80 = new Neighborhood(context.getResources().getString(R.string.dubai_motor_city));
            Neighborhood subFavorite81 = new Neighborhood(context.getResources().getString(R.string.dubai_mushrif_park));
            Neighborhood subFavorite82 = new Neighborhood(context.getResources().getString(R.string.dubai_nadd_al_hammar));
            Neighborhood subFavorite83 = new Neighborhood(context.getResources().getString(R.string.dubai_nadd_al_sheba));
            Neighborhood subFavorite84 = new Neighborhood(context.getResources().getString(R.string.dubai_old_town));
            Neighborhood subFavorite85 = new Neighborhood(context.getResources().getString(R.string.dubai_oud_al_muteena));
            Neighborhood subFavorite86 = new Neighborhood(context.getResources().getString(R.string.dubai_palm_jebel_ali));
            Neighborhood subFavorite87 = new Neighborhood(context.getResources().getString(R.string.dubai_palm_jumeirah));
            Neighborhood subFavorite88 = new Neighborhood(context.getResources().getString(R.string.dubai_ras_al_khor));
            Neighborhood subFavorite89 = new Neighborhood(context.getResources().getString(R.string.dubai_reem));

            Neighborhood subFavorite90 = new Neighborhood(context.getResources().getString(R.string.dubai_sheikh_zayed_road));
            Neighborhood subFavorite91 = new Neighborhood(context.getResources().getString(R.string.dubai_technology_park));
            Neighborhood subFavorite92 = new Neighborhood(context.getResources().getString(R.string.dubai_tecom));
            Neighborhood subFavorite93 = new Neighborhood(context.getResources().getString(R.string.dubai_the_gardens));
            Neighborhood subFavorite94 = new Neighborhood(context.getResources().getString(R.string.dubai_the_hills));
            Neighborhood subFavorite95 = new Neighborhood(context.getResources().getString(R.string.dubai_the_lagoons));
            Neighborhood subFavorite96 = new Neighborhood(context.getResources().getString(R.string.dubai_the_lakes));
            Neighborhood subFavorite97 = new Neighborhood(context.getResources().getString(R.string.dubai_the_meadows));
            Neighborhood subFavorite98 = new Neighborhood(context.getResources().getString(R.string.dubai_the_palm_deira));
            Neighborhood subFavorite99 = new Neighborhood(context.getResources().getString(R.string.dubai_the_springs));

            Neighborhood subFavorite100 = new Neighborhood(context.getResources().getString(R.string.dubai_the_views));
            Neighborhood subFavorite101 = new Neighborhood(context.getResources().getString(R.string.dubai_the_world_islands));
            Neighborhood subFavorite102 = new Neighborhood(context.getResources().getString(R.string.dubai_umm_al_sheif));
            Neighborhood subFavorite103 = new Neighborhood(context.getResources().getString(R.string.dubai_umm_hurair));
            Neighborhood subFavorite104 = new Neighborhood(context.getResources().getString(R.string.dubai_umm_ramool));
            Neighborhood subFavorite105 = new Neighborhood(context.getResources().getString(R.string.dubai_umm_suqeim));
            Neighborhood subFavorite106 = new Neighborhood(context.getResources().getString(R.string.dubai_victory_heights));
            Neighborhood subFavorite107 = new Neighborhood(context.getResources().getString(R.string.dubai_wadi_al_amardi));
            Neighborhood subFavorite108 = new Neighborhood(context.getResources().getString(R.string.dubai_world_trade_center));
            Neighborhood subFavorite109 = new Neighborhood(context.getResources().getString(R.string.dubai_zabeel));

            Neighborhood subFavorite110 = new Neighborhood(context.getResources().getString(R.string.dubai_zulal));
            Neighborhood subFavorite111 = new Neighborhood(context.getResources().getString(R.string.dubai_al_badaa));
            Neighborhood subFavorite112 = new Neighborhood(context.getResources().getString(R.string.dubai_al_nahda));
            Neighborhood subFavorite113 = new Neighborhood(context.getResources().getString(R.string.dubai_al_rashidiya));
            Neighborhood subFavorite114 = new Neighborhood(context.getResources().getString(R.string.dubai_south_dubai));
            Neighborhood subFavorite115 = new Neighborhood(context.getResources().getString(R.string.dubai_damac_hills));
            Neighborhood subFavorite116 = new Neighborhood(context.getResources().getString(R.string.dubai_bluewaters_island));
            Neighborhood subFavorite117 = new Neighborhood(context.getResources().getString(R.string.dubai_mudon));
            Neighborhood subFavorite118 = new Neighborhood(context.getResources().getString(R.string.dubai_liwan));
            Neighborhood subFavorite119 = new Neighborhood(context.getResources().getString(R.string.dubai_serena));

            Neighborhood subFavorite120 = new Neighborhood(context.getResources().getString(R.string.dubai_port_rashid));
            Neighborhood subFavorite121 = new Neighborhood(context.getResources().getString(R.string.dubai_remram));
            Neighborhood subFavorite122 = new Neighborhood(context.getResources().getString(R.string.dubai_sceince_park));
            Neighborhood subFavorite123 = new Neighborhood(context.getResources().getString(R.string.dubai_residence_complex));
            Neighborhood subFavorite124 = new Neighborhood(context.getResources().getString(R.string.dubai_al_manara));

            Neighborhood subFavorite130 = new Neighborhood(context.getResources().getString(R.string.can_not_find));

            neighborhoodArrayL.add(subFavorite1);
            neighborhoodArrayL.add(subFavorite2);
            neighborhoodArrayL.add(subFavorite3);
            neighborhoodArrayL.add(subFavorite4);
            neighborhoodArrayL.add(subFavorite5);
            neighborhoodArrayL.add(subFavorite6);
            neighborhoodArrayL.add(subFavorite7);
            neighborhoodArrayL.add(subFavorite8);
            neighborhoodArrayL.add(subFavorite9);

            neighborhoodArrayL.add(subFavorite10);
            neighborhoodArrayL.add(subFavorite11);
            neighborhoodArrayL.add(subFavorite12);
            neighborhoodArrayL.add(subFavorite13);
            neighborhoodArrayL.add(subFavorite14);
            neighborhoodArrayL.add(subFavorite15);
            neighborhoodArrayL.add(subFavorite16);
            neighborhoodArrayL.add(subFavorite17);
            neighborhoodArrayL.add(subFavorite18);
            neighborhoodArrayL.add(subFavorite19);

            neighborhoodArrayL.add(subFavorite20);
            neighborhoodArrayL.add(subFavorite21);
            neighborhoodArrayL.add(subFavorite22);
            neighborhoodArrayL.add(subFavorite23);
            neighborhoodArrayL.add(subFavorite24);
            neighborhoodArrayL.add(subFavorite25);
            neighborhoodArrayL.add(subFavorite26);
            neighborhoodArrayL.add(subFavorite27);
            neighborhoodArrayL.add(subFavorite28);
            neighborhoodArrayL.add(subFavorite29);

            neighborhoodArrayL.add(subFavorite30);
            neighborhoodArrayL.add(subFavorite31);
            neighborhoodArrayL.add(subFavorite32);
            neighborhoodArrayL.add(subFavorite33);
            neighborhoodArrayL.add(subFavorite34);
            neighborhoodArrayL.add(subFavorite35);
            neighborhoodArrayL.add(subFavorite36);
            neighborhoodArrayL.add(subFavorite37);
            neighborhoodArrayL.add(subFavorite38);
            neighborhoodArrayL.add(subFavorite39);

            neighborhoodArrayL.add(subFavorite40);
            neighborhoodArrayL.add(subFavorite41);
            neighborhoodArrayL.add(subFavorite42);
            neighborhoodArrayL.add(subFavorite43);
            neighborhoodArrayL.add(subFavorite44);
            neighborhoodArrayL.add(subFavorite45);
            neighborhoodArrayL.add(subFavorite46);
            neighborhoodArrayL.add(subFavorite47);
            neighborhoodArrayL.add(subFavorite48);
            neighborhoodArrayL.add(subFavorite49);

            neighborhoodArrayL.add(subFavorite50);
            neighborhoodArrayL.add(subFavorite51);
            neighborhoodArrayL.add(subFavorite52);
            neighborhoodArrayL.add(subFavorite53);
            neighborhoodArrayL.add(subFavorite54);
            neighborhoodArrayL.add(subFavorite55);
            neighborhoodArrayL.add(subFavorite56);
            neighborhoodArrayL.add(subFavorite57);
            neighborhoodArrayL.add(subFavorite58);
            neighborhoodArrayL.add(subFavorite59);

            neighborhoodArrayL.add(subFavorite60);
            neighborhoodArrayL.add(subFavorite61);
            neighborhoodArrayL.add(subFavorite62);
            neighborhoodArrayL.add(subFavorite63);
            neighborhoodArrayL.add(subFavorite64);
            neighborhoodArrayL.add(subFavorite65);
            neighborhoodArrayL.add(subFavorite66);
            neighborhoodArrayL.add(subFavorite67);
            neighborhoodArrayL.add(subFavorite68);
            neighborhoodArrayL.add(subFavorite69);

            neighborhoodArrayL.add(subFavorite70);
            neighborhoodArrayL.add(subFavorite71);
            neighborhoodArrayL.add(subFavorite72);
            neighborhoodArrayL.add(subFavorite73);
            neighborhoodArrayL.add(subFavorite74);
            neighborhoodArrayL.add(subFavorite75);
            neighborhoodArrayL.add(subFavorite76);
            neighborhoodArrayL.add(subFavorite77);
            neighborhoodArrayL.add(subFavorite78);
            neighborhoodArrayL.add(subFavorite79);

            neighborhoodArrayL.add(subFavorite80);
            neighborhoodArrayL.add(subFavorite81);
            neighborhoodArrayL.add(subFavorite82);
            neighborhoodArrayL.add(subFavorite83);
            neighborhoodArrayL.add(subFavorite84);
            neighborhoodArrayL.add(subFavorite85);
            neighborhoodArrayL.add(subFavorite86);
            neighborhoodArrayL.add(subFavorite87);
            neighborhoodArrayL.add(subFavorite88);
            neighborhoodArrayL.add(subFavorite89);

            neighborhoodArrayL.add(subFavorite90);
            neighborhoodArrayL.add(subFavorite91);
            neighborhoodArrayL.add(subFavorite92);
            neighborhoodArrayL.add(subFavorite93);
            neighborhoodArrayL.add(subFavorite94);
            neighborhoodArrayL.add(subFavorite95);
            neighborhoodArrayL.add(subFavorite96);
            neighborhoodArrayL.add(subFavorite97);
            neighborhoodArrayL.add(subFavorite98);
            neighborhoodArrayL.add(subFavorite99);

            neighborhoodArrayL.add(subFavorite100);
            neighborhoodArrayL.add(subFavorite101);
            neighborhoodArrayL.add(subFavorite102);
            neighborhoodArrayL.add(subFavorite103);
            neighborhoodArrayL.add(subFavorite104);
            neighborhoodArrayL.add(subFavorite105);
            neighborhoodArrayL.add(subFavorite106);
            neighborhoodArrayL.add(subFavorite107);
            neighborhoodArrayL.add(subFavorite108);
            neighborhoodArrayL.add(subFavorite109);

            neighborhoodArrayL.add(subFavorite110);
            neighborhoodArrayL.add(subFavorite111);
            neighborhoodArrayL.add(subFavorite112);
            neighborhoodArrayL.add(subFavorite113);
            neighborhoodArrayL.add(subFavorite114);
            neighborhoodArrayL.add(subFavorite115);
            neighborhoodArrayL.add(subFavorite116);
            neighborhoodArrayL.add(subFavorite117);
            neighborhoodArrayL.add(subFavorite118);
            neighborhoodArrayL.add(subFavorite119);

            neighborhoodArrayL.add(subFavorite120);
            neighborhoodArrayL.add(subFavorite121);
            neighborhoodArrayL.add(subFavorite122);
            neighborhoodArrayL.add(subFavorite123);
            neighborhoodArrayL.add(subFavorite124);

            neighborhoodArrayL.add(subFavorite130);

        }

        if (city.equals("abu_dhabi"))
        {
            Neighborhood subFavorite1 = new Neighborhood(context.getResources().getString(R.string.abu_dhabi_gate_city));
            Neighborhood subFavorite2 = new Neighborhood(context.getResources().getString(R.string.abu_dhabi_airport));

            neighborhoodArrayL.add(subFavorite1);
            neighborhoodArrayL.add(subFavorite2);
        }

        return neighborhoodArrayL;
    }
}
