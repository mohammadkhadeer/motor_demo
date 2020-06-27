package com.cars.halamotor.functions;

import android.content.Context;
import android.util.Log;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarMake;
import com.cars.halamotor.model.CarMakeAndCarModel;
import com.cars.halamotor.model.CarModel;
import com.cars.halamotor.model.ItemFilterModel;

import java.util.ArrayList;

import static com.cars.halamotor.functions.FillCarMakeArrayListsInCarDerails.fillCarMakeArrayL;


public class FillCarModel {

    public static ArrayList<CarModel> fillCarModelArrayL
            (ArrayList<CarModel> carModelArrayList, Context context, String carMake) {
        carModelArrayList = new ArrayList<CarModel>();

        if (carMake.equals(context.getString(R.string.hyundai)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.h_1_starex),context.getString(R.string.h_1_starex_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.i_10),context.getString(R.string.i_10_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.i_20),context.getString(R.string.i_20_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.i_30),context.getString(R.string.i_30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.i_40),context.getString(R.string.i_40_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.atos),context.getString(R.string.atos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.azera),context.getString(R.string.azera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.accent),context.getString(R.string.accent_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.h_100),context.getString(R.string.h_100_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.excel),context.getString(R.string.excel_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.elantra),context.getString(R.string.elantra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.avante),context.getString(R.string.avante_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.equus),context.getString(R.string.equus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ioniq),context.getString(R.string.ioniq_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porter),context.getString(R.string.porter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pony),context.getString(R.string.pony_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.trajet),context.getString(R.string.trajet_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tuscani),context.getString(R.string.tuscani_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.terracan),context.getString(R.string.terracan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tiburon),context.getString(R.string.tiburon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.galloper),context.getString(R.string.galloper_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.getz),context.getString(R.string.getz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.genesis),context.getString(R.string.genesis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.genesis_coupe),context.getString(R.string.genesis_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.santamo),context.getString(R.string.santamo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.stellar),context.getString(R.string.stellar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scoupe),context.getString(R.string.scoupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.santa_fe),context.getString(R.string.santa_fe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.centennial),context.getString(R.string.centennial_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.sonata),context.getString(R.string.sonata_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.veloster),context.getString(R.string.veloster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.veracruz),context.getString(R.string.veracruz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.verna),context.getString(R.string.verna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.creta),context.getString(R.string.creta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.coupe),context.getString(R.string.coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.matrix),context.getString(R.string.matrix_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mighty),context.getString(R.string.mighty_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kona),context.getString(R.string.kona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.eon),context.getString(R.string.eon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.palisade),context.getString(R.string.palisade_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.click),context.getString(R.string.click_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.entourage),context.getString(R.string.entourage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.county),context.getString(R.string.county_s)));
        }
        if (carMake.equals(context.getString(R.string.toyota)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_4runner),context.getString(R.string.toyota_4runner_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_c_hr),context.getString(R.string.toyota_c_hr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_mr2),context.getString(R.string.toyota_mr2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_iq),context.getString(R.string.toyota_iq_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_avalon),context.getString(R.string.toyota_avalon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_avanza),context.getString(R.string.toyota_avanza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_avensis),context.getString(R.string.toyota_avensis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_alphard),context.getString(R.string.toyota_alphard_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_allex),context.getString(R.string.toyota_allex_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_opa),context.getString(R.string.toyota_opa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_auris),context.getString(R.string.toyota_auris_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_echo),context.getString(R.string.toyota_echo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_innova),context.getString(R.string.toyota_innova_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_aristo),context.getString(R.string.toyota_aristo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_fj_cruiser),context.getString(R.string.toyota_fj_cruiser_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_mark_x),context.getString(R.string.toyota_mark_x_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_altezza),context.getString(R.string.toyota_altezza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_allion),context.getString(R.string.toyota_allion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_urban_cruiser),context.getString(R.string.toyota_urban_cruiser_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_orgin),context.getString(R.string.toyota_orgin_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_aurion),context.getString(R.string.toyota_aurion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_ipsum),context.getString(R.string.toyota_ipsum_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_aygo),context.getString(R.string.toyota_aygo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_passo),context.getString(R.string.toyota_passo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_paseo),context.getString(R.string.toyota_paseo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_prado),context.getString(R.string.toyota_prado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_probox),context.getString(R.string.toyota_probox_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_progres),context.getString(R.string.toyota_progres_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_pronard),context.getString(R.string.toyota_pronard_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_previa),context.getString(R.string.toyota_previa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_premio),context.getString(R.string.toyota_premio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_prius),context.getString(R.string.toyota_prius_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_prius_c),context.getString(R.string.toyota_prius_c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_blade),context.getString(R.string.toyota_blade_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_blizzard),context.getString(R.string.toyota_blizzard_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_porte),context.getString(R.string.toyota_porte_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_bb),context.getString(R.string.toyota_bb_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_picnic),context.getString(R.string.toyota_picnic_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_tacoma),context.getString(R.string.toyota_tacoma_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_townace),context.getString(R.string.toyota_townace_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_chaser),context.getString(R.string.toyota_chaser_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_tundra),context.getString(R.string.toyota_tundra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_tercel),context.getString(R.string.toyota_tercel_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_grand_hiace),context.getString(R.string.toyota_grand_hiace_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_gt_86),context.getString(R.string.toyota_gt_86_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_duet),context.getString(R.string.toyota_duet_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_dyna),context.getString(R.string.toyota_dyna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_rav_4),context.getString(R.string.toyota_rav_4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_ractis),context.getString(R.string.toyota_ractis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_raum),context.getString(R.string.toyota_raum_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_rush),context.getString(R.string.toyota_rush_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_regius),context.getString(R.string.toyota_regius_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_zelas),context.getString(R.string.toyota_zelas_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sparky),context.getString(R.string.toyota_sparky_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sprinter),context.getString(R.string.toyota_sprinter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_starlet),context.getString(R.string.toyota_starlet_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_succeed),context.getString(R.string.toyota_succeed_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_scepter),context.getString(R.string.toyota_scepter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_supra),context.getString(R.string.toyota_supra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_soarer),context.getString(R.string.toyota_soarer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_soluna),context.getString(R.string.toyota_soluna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sera),context.getString(R.string.toyota_sera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sequoia),context.getString(R.string.toyota_sequoia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_celsior),context.getString(R.string.toyota_celsior_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sequoia),context.getString(R.string.toyota_sequoia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_celsior),context.getString(R.string.toyota_celsior_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_celica),context.getString(R.string.toyota_celica_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sienta),context.getString(R.string.toyota_sienta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_scion),context.getString(R.string.toyota_scion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sienna),context.getString(R.string.toyota_sienna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_land_cruiser_pickup),context.getString(R.string.toyota_land_cruiser_pickup_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_gaia),context.getString(R.string.toyota_gaia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_granvia),context.getString(R.string.toyota_granvia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_vellfire),context.getString(R.string.toyota_vellfire_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_venza),context.getString(R.string.toyota_venza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_fun_cargo),context.getString(R.string.toyota_fun_cargo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_fortuner),context.getString(R.string.toyota_fortuner_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_voxy),context.getString(R.string.toyota_voxy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_voltz),context.getString(R.string.toyota_voltz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_verso),context.getString(R.string.toyota_verso_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_carina),context.getString(R.string.toyota_carina_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_cavalier),context.getString(R.string.toyota_cavalier_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_caldina),context.getString(R.string.toyota_caldina_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_camry),context.getString(R.string.toyota_camry_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_crown),context.getString(R.string.toyota_crown_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_cressida),context.getString(R.string.toyota_cressida_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_corolla),context.getString(R.string.toyota_corolla_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_Corona),context.getString(R.string.toyota_Corona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_coaster),context.getString(R.string.toyota_coaster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_land_cruiser),context.getString(R.string.toyota_land_cruiser_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_land_cruiser_j70),context.getString(R.string.toyota_land_cruiser_j70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_liteAce),context.getString(R.string.toyota_liteAce_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_matrix),context.getString(R.string.toyota_matrix_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_mark_2),context.getString(R.string.toyota_mark_2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_master_ace),context.getString(R.string.toyota_master_ace_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_mega_cruiser),context.getString(R.string.toyota_mega_cruiser_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_harrier),context.getString(R.string.toyota_harrier_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_hiace),context.getString(R.string.toyota_hiace_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_highlander),context.getString(R.string.toyota_highlander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_hilux),context.getString(R.string.toyota_hilux_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_wish),context.getString(R.string.toyota_wish_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_will),context.getString(R.string.toyota_will_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_windom),context.getString(R.string.toyota_windom_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_yaris),context.getString(R.string.toyota_yaris_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_2000_gt),context.getString(R.string.toyota_2000_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_ai_300),context.getString(R.string.toyota_ai_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_will),context.getString(R.string.toyota_will_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_axio),context.getString(R.string.toyota_axio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_celstar),context.getString(R.string.toyota_celstar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_corolla),context.getString(R.string.toyota_corolla_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_fielder),context.getString(R.string.toyota_fielder_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_noah),context.getString(R.string.toyota_noah_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_rumion),context.getString(R.string.toyota_rumion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_runx),context.getString(R.string.toyota_runx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_solara),context.getString(R.string.toyota_solara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_sprinter_carib),context.getString(R.string.toyota_sprinter_carib_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_vanguard),context.getString(R.string.toyota_vanguard_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.toyota_verossa),context.getString(R.string.toyota_verossa_s)));

        }
        if (carMake.equals(context.getString(R.string.kia)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_asia),context.getString(R.string.kia_asia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_avila),context.getString(R.string.kia_avila_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_optima),context.getString(R.string.kia_optima_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_opirus),context.getString(R.string.kia_opirus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_elan),context.getString(R.string.kia_elan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_pride),context.getString(R.string.kia_pride_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_borrego),context.getString(R.string.kia_borrego_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_bongo),context.getString(R.string.kia_bongo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_besta),context.getString(R.string.kia_besta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_picanto),context.getString(R.string.kia_picanto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_granbird),context.getString(R.string.kia_granbird_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_joice),context.getString(R.string.kia_joice_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_retona),context.getString(R.string.kia_retona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_rio),context.getString(R.string.kia_rio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_sportage),context.getString(R.string.kia_sportage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_spectra),context.getString(R.string.kia_spectra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_sorento),context.getString(R.string.kia_sorento_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_soul),context.getString(R.string.kia_soul_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_cerato),context.getString(R.string.kia_cerato_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_cerato_koup),context.getString(R.string.kia_cerato_koup_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_sephia),context.getString(R.string.kia_sephia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_sienna),context.getString(R.string.kia_sienna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_shuma),context.getString(R.string.kia_shuma_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_forte),context.getString(R.string.kia_forte_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_venga),context.getString(R.string.kia_venga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_captital),context.getString(R.string.kia_captital_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_cadenza),context.getString(R.string.kia_cadenza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_carens),context.getString(R.string.kia_carens_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_carnival),context.getString(R.string.kia_carnival_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_clarus),context.getString(R.string.kia_clarus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_quoris),context.getString(R.string.kia_quoris_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_cosmos),context.getString(R.string.kia_cosmos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_concorde),context.getString(R.string.kia_concorde_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_magnetis),context.getString(R.string.kia_magnetis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_mohave),context.getString(R.string.kia_mohave_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_niro),context.getString(R.string.kia_niro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_ray),context.getString(R.string.kia_ray_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_telluride),context.getString(R.string.kia_telluride_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_stinger),context.getString(R.string.kia_stinger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_creed),context.getString(R.string.kia_creed_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_stonic),context.getString(R.string.kia_stonic_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_sedona),context.getString(R.string.kia_sedona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_lotze),context.getString(R.string.kia_lotze_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.kia_pegas),context.getString(R.string.kia_pegas_s)));
        }
        if (carMake.equals(context.getString(R.string.bmw)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_116),context.getString(R.string.bmw_116_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_118),context.getString(R.string.bmw_118_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_120),context.getString(R.string.bmw_120_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_125),context.getString(R.string.bmw_125_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_135),context.getString(R.string.bmw_135_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_225),context.getString(R.string.bmw_225_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_),context.getString(R.string.bmw__s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_2002),context.getString(R.string.bmw_2002_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_316),context.getString(R.string.bmw_316_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_318),context.getString(R.string.bmw_318_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_320),context.getString(R.string.bmw_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_323),context.getString(R.string.bmw_323_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_325),context.getString(R.string.bmw_325_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_328),context.getString(R.string.bmw_328_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_330),context.getString(R.string.bmw_330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_335),context.getString(R.string.bmw_335_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_e30),context.getString(R.string.bmw_e30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_328_gran_turismo),context.getString(R.string.bmw_328_gran_turismo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_gt),context.getString(R.string.bmw_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_420),context.getString(R.string.bmw_420_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_428),context.getString(R.string.bmw_428_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_435),context.getString(R.string.bmw_435_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_520),context.getString(R.string.bmw_520_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_523),context.getString(R.string.bmw_523_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_525),context.getString(R.string.bmw_525_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_528),context.getString(R.string.bmw_528_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_530),context.getString(R.string.bmw_530_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_535),context.getString(R.string.bmw_535_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_540),context.getString(R.string.bmw_540_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_545),context.getString(R.string.bmw_545_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_550),context.getString(R.string.bmw_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_e39),context.getString(R.string.bmw_e39_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_535gran_turismo),context.getString(R.string.bmw_535gran_turismo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_630),context.getString(R.string.bmw_630_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_640),context.getString(R.string.bmw_640_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_645),context.getString(R.string.bmw_645_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_650),context.getString(R.string.bmw_650_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_760),context.getString(R.string.audi_a_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a),context.getString(R.string.bmw_760_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_730),context.getString(R.string.bmw_730_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_735),context.getString(R.string.bmw_735_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_740),context.getString(R.string.bmw_740_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_745),context.getString(R.string.bmw_745_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_750),context.getString(R.string.audi_a_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_i3),context.getString(R.string.bmw_i3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_i8),context.getString(R.string.bmw_i8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_m2),context.getString(R.string.bmw_m2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_m3),context.getString(R.string.bmw_m3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_m5),context.getString(R.string.bmw_m5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_m6),context.getString(R.string.bmw_m6_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_m_coupe),context.getString(R.string.bmw_m_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_m4),context.getString(R.string.bmw_m4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_1m),context.getString(R.string.bmw_1m_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_m_roadster),context.getString(R.string.bmw_m_roadster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_x3),context.getString(R.string.bmw_x3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_x4),context.getString(R.string.bmw_x4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_x5),context.getString(R.string.bmw_x5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_x6),context.getString(R.string.bmw_x6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_x6_m),context.getString(R.string.bmw_x6_m_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_x5_m),context.getString(R.string.bmw_x5_m_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_x7),context.getString(R.string.bmw_x7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_z1),context.getString(R.string.bmw_z1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_z3),context.getString(R.string.bmw_z3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_z3m),context.getString(R.string.bmw_z3m_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_z4),context.getString(R.string.bmw_z4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_z4m),context.getString(R.string.bmw_z4m_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_z8),context.getString(R.string.bmw_z8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_1502),context.getString(R.string.bmw_1502_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bmw_alpina),context.getString(R.string.bmw_alpina_s)));
        }
        if (carMake.equals(context.getString(R.string.mercedes_benz)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.Mercedes_benz_gle_400_amg),context.getString(R.string.Mercedes_benz_gle_400_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gle_450_amg),context.getString(R.string.mercedes_benz_gle_450_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Mercedes_benz_gle_500),context.getString(R.string.Mercedes_benz_gle_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gle_63_amg),context.getString(R.string.mercedes_benz_gle_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gla_class),context.getString(R.string.mercedes_benz_gla_class_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gla_250),context.getString(R.string.mercedes_benz_gla_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gla_45),context.getString(R.string.mercedes_benz_gla_45_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_a_class),context.getString(R.string.mercedes_benz_a_class_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_a_140),context.getString(R.string.mercedes_benz_a_140_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_a_45),context.getString(R.string.mercedes_benz_a_45_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_a_160),context.getString(R.string.mercedes_benz_a_160_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_a_180),context.getString(R.string.mercedes_benz_a_180_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_a_250),context.getString(R.string.mercedes_benz_a_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_a_45_amg),context.getString(R.string.mercedes_benz_a_45_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_b_class),context.getString(R.string.mercedes_benz_b_class_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_b200),context.getString(R.string.mercedes_benz_b200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_class),context.getString(R.string.mercedes_benz_c_class_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c180),context.getString(R.string.mercedes_benz_c180_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c200),context.getString(R.string.mercedes_benz_c200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_220),context.getString(R.string.mercedes_benz_c_220_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_230),context.getString(R.string.mercedes_benz_c_230_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_240),context.getString(R.string.mercedes_benz_c_240_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c250),context.getString(R.string.mercedes_benz_c250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_280),context.getString(R.string.mercedes_benz_c_280_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_350),context.getString(R.string.mercedes_benz_c_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c63_amg),context.getString(R.string.mercedes_benz_c63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_55),context.getString(R.string.mercedes_benz_c_55_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_350e),context.getString(R.string.mercedes_benz_c_350e_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_180_coupe),context.getString(R.string.mercedes_benz_c_180_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_300_coupe),context.getString(R.string.mercedes_benz_c_300_coupe_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_32_amg),context.getString(R.string.mercedes_benz_c_32_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_43_amg),context.getString(R.string.mercedes_benz_c_43_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_55_amg),context.getString(R.string.mercedes_benz_c_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_63_amg),context.getString(R.string.mercedes_benz_c_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_63_coupe),context.getString(R.string.mercedes_benz_c_63_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_200_coupe),context.getString(R.string.mercedes_benz_c_200_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_c_320),context.getString(R.string.mercedes_benz_c_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_300),context.getString(R.string.mercedes_benz_cl_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_320),context.getString(R.string.mercedes_benz_cl_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_350),context.getString(R.string.mercedes_benz_cl_350_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_500),context.getString(R.string.mercedes_benz_cl_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_55_amg),context.getString(R.string.mercedes_benz_cl_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_65_amg),context.getString(R.string.mercedes_benz_cl_65_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_550),context.getString(R.string.mercedes_benz_cl_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_63_amg),context.getString(R.string.mercedes_benz_cl_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cl_600),context.getString(R.string.mercedes_benz_cl_600_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cla),context.getString(R.string.mercedes_benz_cla_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cla_200),context.getString(R.string.mercedes_benz_cla_220_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cla_220),context.getString(R.string.mercedes_benz_cla_220_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cla_45_amg),context.getString(R.string.mercedes_benz_cla_45_amg_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cla_450),context.getString(R.string.mercedes_benz_cla_450_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cla_250),context.getString(R.string.mercedes_benz_cla_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_clk),context.getString(R.string.mercedes_benz_clk_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_clk_200),context.getString(R.string.mercedes_benz_clk_200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_clk_240),context.getString(R.string.mercedes_benz_clk_240_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_clk_350),context.getString(R.string.mercedes_benz_clk_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_clk_55_amg),context.getString(R.string.mercedes_benz_clk_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_clk_63_amg),context.getString(R.string.mercedes_benz_clk_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_clk_320),context.getString(R.string.mercedes_benz_clk_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cls),context.getString(R.string.mercedes_benz_cls_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cls_350),context.getString(R.string.mercedes_benz_cls_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cls_400),context.getString(R.string.mercedes_benz_cls_400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cls_500),context.getString(R.string.mercedes_benz_cls_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cls_55_amg),context.getString(R.string.mercedes_benz_cls_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cls_63_amg),context.getString(R.string.mercedes_benz_cls_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_cls_550),context.getString(R.string.mercedes_benz_cls_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e190),context.getString(R.string.mercedes_benz_e190_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e200),context.getString(R.string.mercedes_benz_e200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e230),context.getString(R.string.mercedes_benz_e230_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e240),context.getString(R.string.mercedes_benz_e240_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e250),context.getString(R.string.mercedes_benz_e250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e280),context.getString(R.string.mercedes_benz_e280_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e300),context.getString(R.string.mercedes_benz_e300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e320),context.getString(R.string.mercedes_benz_e320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e350),context.getString(R.string.mercedes_benz_e350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e400),context.getString(R.string.mercedes_benz_e400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e500),context.getString(R.string.mercedes_benz_e500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e55_amg),context.getString(R.string.mercedes_benz_e55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e550),context.getString(R.string.mercedes_benz_e550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e63_amg),context.getString(R.string.mercedes_benz_e63_amg_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e63),context.getString(R.string.mercedes_benz_e63_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e350e),context.getString(R.string.mercedes_benz_e350e_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e400_coupe),context.getString(R.string.mercedes_benz_e400_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e430),context.getString(R.string.mercedes_benz_e430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e50),context.getString(R.string.mercedes_benz_e50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e60_amg),context.getString(R.string.mercedes_benz_e60_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_e250_coupe),context.getString(R.string.mercedes_benz_e250_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_300),context.getString(R.string.mercedes_benz_g_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_500),context.getString(R.string.mercedes_benz_g_500_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_55),context.getString(R.string.mercedes_benz_g_55_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_320),context.getString(R.string.mercedes_benz_g_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_36_amg),context.getString(R.string.mercedes_benz_g_36_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_500_4x42),context.getString(R.string.mercedes_benz_g_500_4x42_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_55_amg),context.getString(R.string.mercedes_benz_g_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_550),context.getString(R.string.mercedes_benz_g_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_63_amg_6x6),context.getString(R.string.mercedes_benz_g_63_amg_6x6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_65_amg),context.getString(R.string.mercedes_benz_g_65_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_g_63_amg),context.getString(R.string.mercedes_benz_g_63_amg)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gl_320),context.getString(R.string.mercedes_benz_gl_320_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gl_450),context.getString(R.string.mercedes_benz_gl_450_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gl_500),context.getString(R.string.mercedes_benz_gl_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gl_550),context.getString(R.string.mercedes_benz_gl_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gl_63_amg),context.getString(R.string.mercedes_benz_gl_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gl),context.getString(R.string.mercedes_benz_gl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gls),context.getString(R.string.mercedes_benz_gls_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gla),context.getString(R.string.mercedes_benz_gla_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glk_250),context.getString(R.string.mercedes_benz_glk_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glk_300),context.getString(R.string.mercedes_benz_glk_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glk_350),context.getString(R.string.mercedes_benz_glk_350_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glk),context.getString(R.string.mercedes_benz_glk_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glc),context.getString(R.string.mercedes_benz_glc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glc_250_coupe),context.getString(R.string.mercedes_benz_glc_250_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glc_350e_coupe),context.getString(R.string.mercedes_benz_glc_350e_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glc_250),context.getString(R.string.mercedes_benz_glc_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glc_300),context.getString(R.string.mercedes_benz_glc_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_glc_350e),context.getString(R.string.mercedes_benz_glc_350e_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gle_500e),context.getString(R.string.mercedes_benz_gle_500e_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gle_400),context.getString(R.string.mercedes_benz_gle_400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_ml_250),context.getString(R.string.mercedes_benz_ml_250_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_ml_320),context.getString(R.string.mercedes_benz_ml_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_ml_350),context.getString(R.string.mercedes_benz_ml_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_ml_400),context.getString(R.string.mercedes_benz_ml_400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_ml_500),context.getString(R.string.mercedes_benz_ml_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_ml_63_amg),context.getString(R.string.mercedes_benz_ml_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gle),context.getString(R.string.mercedes_benz_gle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gle_400_coupe),context.getString(R.string.mercedes_benz_gle_400_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_ml),context.getString(R.string.mercedes_benz_ml_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_280),context.getString(R.string.mercedes_benz_s_280_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_300),context.getString(R.string.mercedes_benz_s_300_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_320),context.getString(R.string.mercedes_benz_s_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_400),context.getString(R.string.mercedes_benz_s_400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_500),context.getString(R.string.mercedes_benz_s_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_350),context.getString(R.string.mercedes_benz_s_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_55_amg),context.getString(R.string.mercedes_benz_s_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_400_coupe),context.getString(R.string.mercedes_benz_s_400_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_430),context.getString(R.string.mercedes_benz_s_430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_500_coupe),context.getString(R.string.mercedes_benz_s_500_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_55),context.getString(R.string.mercedes_benz_s_55_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_550_Coupe),context.getString(R.string.mercedes_benz_s_550_Coupe_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_63_amg),context.getString(R.string.mercedes_benz_s_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_63_amg_coupe),context.getString(R.string.mercedes_benz_s_63_amg_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_65_amg),context.getString(R.string.mercedes_benz_s_65_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_550),context.getString(R.string.mercedes_benz_s_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_s_600),context.getString(R.string.mercedes_benz_s_600_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_maybach),context.getString(R.string.mercedes_maybach_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_300_se),context.getString(R.string.mercedes_benz_300_se_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl),context.getString(R.string.mercedes_benz_sl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_320),context.getString(R.string.mercedes_benz_sl_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_350),context.getString(R.string.mercedes_benz_sl_350_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_400),context.getString(R.string.mercedes_benz_sl_400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_500),context.getString(R.string.mercedes_benz_sl_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_55_amg),context.getString(R.string.mercedes_benz_sl_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_550),context.getString(R.string.mercedes_benz_sl_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_560),context.getString(R.string.mercedes_benz_sl_560_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_63_amg),context.getString(R.string.mercedes_benz_sl_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sl_65_amg),context.getString(R.string.mercedes_benz_sl_65_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slc),context.getString(R.string.mercedes_benz_slc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slc_200),context.getString(R.string.mercedes_benz_slc_200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk),context.getString(R.string.mercedes_benz_slk_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_200),context.getString(R.string.mercedes_benz_slk_200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_230),context.getString(R.string.mercedes_benz_slk_230_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_250),context.getString(R.string.mercedes_benz_slk_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_280),context.getString(R.string.mercedes_benz_slk_280_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_320),context.getString(R.string.mercedes_benz_slk_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_350),context.getString(R.string.mercedes_benz_slk_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_55_amg),context.getString(R.string.mercedes_benz_slk_55_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slk_63_amg),context.getString(R.string.mercedes_benz_slk_63_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_v_class),context.getString(R.string.mercedes_benz_v_class_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_vito_119),context.getString(R.string.mercedes_benz_vito_119_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_vito_109),context.getString(R.string.mercedes_benz_vito_109_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_vito_111),context.getString(R.string.mercedes_benz_vito_111_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_vito_114),context.getString(R.string.mercedes_benz_vito_114_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_vito_116),context.getString(R.string.mercedes_benz_vito_116_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_v_250),context.getString(R.string.mercedes_benz_v_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_v_220),context.getString(R.string.mercedes_benz_v_220_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_class),context.getString(R.string.mercedes_benz_r_class_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_280),context.getString(R.string.mercedes_benz_r_280_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_300),context.getString(R.string.mercedes_benz_r_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_320),context.getString(R.string.mercedes_benz_r_320_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_350),context.getString(R.string.mercedes_benz_r_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_500),context.getString(R.string.mercedes_benz_r_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_550),context.getString(R.string.mercedes_benz_r_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_r_63),context.getString(R.string.mercedes_benz_r_63_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_x_220d),context.getString(R.string.mercedes_benz_x_220d_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_x_250d),context.getString(R.string.mercedes_benz_x_250d_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_x_350d),context.getString(R.string.mercedes_benz_x_350d_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_amg_gt),context.getString(R.string.mercedes_benz_amg_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sprinter),context.getString(R.string.mercedes_benz_sprinter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_smart),context.getString(R.string.mercedes_benz_smart_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_vito),context.getString(R.string.mercedes_benz_vito_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_eqc),context.getString(R.string.mercedes_benz_eqc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_190),context.getString(R.string.mercedes_benz_190_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_200),context.getString(R.string.mercedes_benz_200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_230),context.getString(R.string.mercedes_benz_230_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_250),context.getString(R.string.mercedes_benz_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_280),context.getString(R.string.mercedes_benz_280_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_300),context.getString(R.string.mercedes_benz_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_320),context.getString(R.string.mercedes_benz_320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_380),context.getString(R.string.mercedes_benz_380_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_450),context.getString(R.string.mercedes_benz_450_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_500),context.getString(R.string.mercedes_benz_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_560),context.getString(R.string.mercedes_benz_560_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_actros),context.getString(R.string.mercedes_benz_actros_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_axor),context.getString(R.string.mercedes_benz_axor_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_gazelle),context.getString(R.string.mercedes_benz_gazelle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_slr),context.getString(R.string.mercedes_benz_slr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_sls_amg),context.getString(R.string.mercedes_benz_sls_amg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_viano),context.getString(R.string.mercedes_benz_viano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercedes_benz_other),context.getString(R.string.mercedes_benz_other_s)));


        }
        if (carMake.equals(context.getString(R.string.audi)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a),context.getString(R.string.audi_a_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a1),context.getString(R.string.audi_a1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a2),context.getString(R.string.audi_a2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a3),context.getString(R.string.audi_a3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a4),context.getString(R.string.audi_a4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a5),context.getString(R.string.audi_a5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a6),context.getString(R.string.audi_a6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a7),context.getString(R.string.audi_a7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a8),context.getString(R.string.audi_a8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a9),context.getString(R.string.audi_a9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_q),context.getString(R.string.audi_q_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_q3),context.getString(R.string.audi_q3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_q5),context.getString(R.string.audi_q5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_q7),context.getString(R.string.audi_q7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_r),context.getString(R.string.audi_r_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_r8),context.getString(R.string.audi_r8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_rs1),context.getString(R.string.audi_rs1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_rs2),context.getString(R.string.audi_rs2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_rs3),context.getString(R.string.audi_rs3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_rs4),context.getString(R.string.audi_rs4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_rs5),context.getString(R.string.audi_rs5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_rs6),context.getString(R.string.audi_rs6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s_),context.getString(R.string.audi_s__s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s1),context.getString(R.string.audi_s1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s3),context.getString(R.string.audi_s3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s4),context.getString(R.string.audi_s4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s5),context.getString(R.string.audi_s5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s6),context.getString(R.string.audi_s6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s7),context.getString(R.string.audi_s7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_s8),context.getString(R.string.audi_s8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_50),context.getString(R.string.audi_50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_60),context.getString(R.string.audi_60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_80),context.getString(R.string.audi_80_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_90),context.getString(R.string.audi_90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_100),context.getString(R.string.audi_100_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_200),context.getString(R.string.audi_200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_tt),context.getString(R.string.audi_tt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_v8),context.getString(R.string.audi_v8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_cabriolet),context.getString(R.string.audi_cabriolet_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_quattro),context.getString(R.string.audi_quattro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_coupe),context.getString(R.string.audi_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_e_tron),context.getString(R.string.audi_e_tron_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_tt_rs),context.getString(R.string.audi_tt_rs_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_tts),context.getString(R.string.audi_tts_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_other),context.getString(R.string.audi_other_s)));


        }
        if (carMake.equals(context.getString(R.string.isuzu)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_select_all),context.getString(R.string.isuzu_select_all_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_fsr),context.getString(R.string.isuzu_fsr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_nkr),context.getString(R.string.isuzu_nkr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_i_mark),context.getString(R.string.isuzu_i_mark_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_aska),context.getString(R.string.isuzu_aska_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_amigo),context.getString(R.string.isuzu_amigo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_impulse),context.getString(R.string.isuzu_impulse_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_ascender),context.getString(R.string.isuzu_ascender_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_axiom),context.getString(R.string.isuzu_axiom_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_piazza),context.getString(R.string.isuzu_piazza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_bighorn),context.getString(R.string.isuzu_bighorn_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_trooper),context.getString(R.string.isuzu_trooper_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_giga),context.getString(R.string.isuzu_giga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_d_max),context.getString(R.string.isuzu_d_max_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_rodeo),context.getString(R.string.isuzu_rodeo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_fster),context.getString(R.string.isuzu_fster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_filly),context.getString(R.string.isuzu_filly_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_vehicross),context.getString(R.string.isuzu_vehicross_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_wizard),context.getString(R.string.isuzu_wizard_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_elf),context.getString(R.string.isuzu_elf_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_forward),context.getString(R.string.isuzu_forward_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_juston),context.getString(R.string.isuzu_juston_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_pickup),context.getString(R.string.isuzu_pickup_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_reward),context.getString(R.string.isuzu_reward_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_v430),context.getString(R.string.isuzu_v430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.isuzu_other),context.getString(R.string.isuzu_other_s)));
        }
        if (carMake.equals(context.getString(R.string.infiniti)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_e),context.getString(R.string.infiniti_e_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_e30),context.getString(R.string.infiniti_e30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_e35),context.getString(R.string.infiniti_e35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_ex),context.getString(R.string.infiniti_ex_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_ex25),context.getString(R.string.infiniti_ex25_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_ex35),context.getString(R.string.infiniti_ex35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_ex37),context.getString(R.string.audi_a_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_FX),context.getString(R.string.infiniti_FX_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_fx37),context.getString(R.string.infiniti_fx37_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_fx45),context.getString(R.string.infiniti_fx45_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_fx50),context.getString(R.string.infiniti_fx50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_fx56),context.getString(R.string.infiniti_fx56_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_fx35),context.getString(R.string.infiniti_fx35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_G),context.getString(R.string.infiniti_G_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_g20),context.getString(R.string.infiniti_g20_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_g25),context.getString(R.string.infiniti_g25_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_g35),context.getString(R.string.infiniti_g35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_g37),context.getString(R.string.infiniti_g37_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_J),context.getString(R.string.infiniti_J_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_j30),context.getString(R.string.infiniti_j30_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_M),context.getString(R.string.infiniti_M_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_m25),context.getString(R.string.infiniti_m25_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_m35),context.getString(R.string.infiniti_m35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_m37),context.getString(R.string.infiniti_m37_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_m45),context.getString(R.string.infiniti_m45_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_m56),context.getString(R.string.infiniti_m56_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_Q),context.getString(R.string.infiniti_Q_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_q45),context.getString(R.string.infiniti_q45_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_qx4),context.getString(R.string.infiniti_qx4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_qx56),context.getString(R.string.infiniti_qx56_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_q60),context.getString(R.string.infiniti_q60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_q70),context.getString(R.string.infiniti_q70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_qx60),context.getString(R.string.infiniti_qx60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_q30),context.getString(R.string.infiniti_q30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_q50),context.getString(R.string.infiniti_q50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_qx80),context.getString(R.string.infiniti_qx80_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_I30),context.getString(R.string.infiniti_I30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_jx35),context.getString(R.string.infiniti_jx35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_q40),context.getString(R.string.infiniti_q40_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_qx50),context.getString(R.string.infiniti_qx50_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_qx70),context.getString(R.string.infiniti_qx70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.infiniti_other),context.getString(R.string.infiniti_other_s)));

        }
        if (carMake.equals(context.getString(R.string.opel)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_agila),context.getString(R.string.opel_agila_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_astra),context.getString(R.string.opel_astra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_ascona),context.getString(R.string.opel_ascona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_admiral),context.getString(R.string.opel_admiral_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_omega),context.getString(R.string.opel_omega_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_antara),context.getString(R.string.opel_antara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_insignia),context.getString(R.string.opel_insignia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_tigra),context.getString(R.string.opel_tigra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_gt),context.getString(R.string.opel_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_diplomat),context.getString(R.string.opel_diplomat_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.opel_rekord),context.getString(R.string.opel_rekord_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_zafira),context.getString(R.string.opel_zafira_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_speedster),context.getString(R.string.opel_speedster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_signum),context.getString(R.string.opel_signum_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_senator),context.getString(R.string.opel_senator_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_sintra),context.getString(R.string.opel_sintra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_frontera),context.getString(R.string.opel_frontera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_vita),context.getString(R.string.opel_vita_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_vivaro),context.getString(R.string.opel_vivaro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_kadett),context.getString(R.string.opel_kadett_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.opel_calibra),context.getString(R.string.opel_calibra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_campo),context.getString(R.string.opel_campo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_corsa),context.getString(R.string.opel_corsa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_combo),context.getString(R.string.opel_combo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_commodore),context.getString(R.string.opel_commodore_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_manta),context.getString(R.string.opel_manta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_movano),context.getString(R.string.opel_movano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_monza),context.getString(R.string.opel_monza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_meriva),context.getString(R.string.opel_meriva_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.opel_other),context.getString(R.string.opel_other_s)));

        }
        if (carMake.equals(context.getString(R.string.bentley)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_turbo_r),context.getString(R.string.bentley_turbo_r_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_arnage),context.getString(R.string.bentley_arnage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_azure),context.getString(R.string.bentley_azure_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_brooklands),context.getString(R.string.bentley_brooklands_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_flying_spur),context.getString(R.string.bentley_flying_spur_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_continental),context.getString(R.string.bentley_continental_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_continental_gt),context.getString(R.string.bentley_continental_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_mulsanne),context.getString(R.string.bentley_mulsanne_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_bentayga),context.getString(R.string.bentley_bentayga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_continental_gtc),context.getString(R.string.bentley_continental_gtc_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_continental_supersports),context.getString(R.string.bentley_continental_supersports_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_turbo_s),context.getString(R.string.bentley_turbo_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bentley_other),context.getString(R.string.bentley_other_s)));

        }
        if (carMake.equals(context.getString(R.string.porsche)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_9xx),context.getString(R.string.porsche_9xx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911),context.getString(R.string.porsche_911_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_924),context.getString(R.string.porsche_924_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_928),context.getString(R.string.porsche_928_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_944),context.getString(R.string.porsche_944_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_959),context.getString(R.string.porsche_959_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_968),context.getString(R.string.porsche_968_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_4),context.getString(R.string.porsche_911_4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_4s),context.getString(R.string.porsche_911_4s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_gt2),context.getString(R.string.porsche_911_gt2_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_gt_3),context.getString(R.string.porsche_911_gt_3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_s),context.getString(R.string.porsche_911_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_targa),context.getString(R.string.porsche_911_targa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_targa_4),context.getString(R.string.porsche_911_targa_4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_turbo),context.getString(R.string.porsche_911_turbo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_911_turbo_s),context.getString(R.string.porsche_911_turbo_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_918_spyder),context.getString(R.string.porsche_918_spyder_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_993),context.getString(R.string.porsche_993_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_996),context.getString(R.string.porsche_996_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_panamera),context.getString(R.string.porsche_panamera_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_boxster),context.getString(R.string.porsche_boxster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_carrera_gt),context.getString(R.string.porsche_carrera_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_cayman),context.getString(R.string.porsche_cayman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_cayenne),context.getString(R.string.porsche_cayenne_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_cayenne_s),context.getString(R.string.porsche_cayenne_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_cayenne_turbo),context.getString(R.string.porsche_cayenne_turbo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_cayenne_turbo_s),context.getString(R.string.porsche_cayenne_turbo_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_cayenne_gts),context.getString(R.string.porsche_cayenne_gts_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_macan),context.getString(R.string.porsche_macan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_boxster_gts),context.getString(R.string.porsche_boxster_gts_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_boxster_s),context.getString(R.string.porsche_boxster_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_cayman_s),context.getString(R.string.porsche_cayman_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_macan_s),context.getString(R.string.porsche_macan_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_macan_turbo),context.getString(R.string.porsche_macan_turbo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_panamera_4),context.getString(R.string.porsche_panamera_4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_Panamera_4s),context.getString(R.string.porsche_Panamera_4s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_panamera_gts),context.getString(R.string.porsche_panamera_gts_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_panamera_s),context.getString(R.string.porsche_panamera_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_panamera_turbo),context.getString(R.string.porsche_panamera_turbo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_panamera_turbo_s),context.getString(R.string.porsche_panamera_turbo_s_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_356),context.getString(R.string.porsche_356_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.porsche_other),context.getString(R.string.porsche_other_s)));

        }
        if (carMake.equals(context.getString(R.string.pontiac)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_6000),context.getString(R.string.pontiac_6000_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g5),context.getString(R.string.pontiac_g5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g6),context.getString(R.string.pontiac_g6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g8),context.getString(R.string.pontiac_g8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_gto),context.getString(R.string.pontiac_gto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_aztek),context.getString(R.string.pontiac_aztek_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_parisian),context.getString(R.string.pontiac_parisian_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_bonneville),context.getString(R.string.pontiac_bonneville_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_trans_sport),context.getString(R.string.pontiac_trans_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_tempest),context.getString(R.string.pontiac_tempest_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_grand_am),context.getString(R.string.pontiac_grand_am_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_gto_grand_prix),context.getString(R.string.pontiac_gto_grand_prix_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g4),context.getString(R.string.pontiac_g4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_solstice),context.getString(R.string.pontiac_solstice_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_sunbrid),context.getString(R.string.pontiac_sunbrid_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_vibe),context.getString(R.string.pontiac_vibe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_firebird),context.getString(R.string.pontiac_firebird_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_fiero),context.getString(R.string.pontiac_fiero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_phoenix),context.getString(R.string.pontiac_phoenix_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_le_mans),context.getString(R.string.pontiac_le_mans_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_montana),context.getString(R.string.pontiac_montana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_roadster),context.getString(R.string.pontiac_roadster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_other),context.getString(R.string.pontiac_other_s)));

        }
        if (carMake.equals(context.getString(R.string.aston_martin)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_bd7),context.getString(R.string.aston_martin_bd7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_bd9),context.getString(R.string.aston_martin_bd9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_bdc),context.getString(R.string.aston_martin_bdc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_one_77),context.getString(R.string.aston_martin_one_77_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_v12),context.getString(R.string.aston_martin_v12_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_v8),context.getString(R.string.aston_martin_v8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_rapide),context.getString(R.string.aston_martin_rapide_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_cygnet),context.getString(R.string.aston_martin_cygnet_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_vanquish),context.getString(R.string.aston_martin_vanquish_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_virage),context.getString(R.string.aston_martin_virage_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_lagonda),context.getString(R.string.aston_martin_lagonda_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_bd6),context.getString(R.string.aston_martin_bd6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_bds),context.getString(R.string.aston_martin_bds_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_v12_vantage),context.getString(R.string.aston_martin_v12_vantage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_v8_vantage),context.getString(R.string.aston_martin_v8_vantage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.aston_martin_other),context.getString(R.string.aston_martin_other_s)));
        }
        if (carMake.equals(context.getString(R.string.alfa_romeo)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_33),context.getString(R.string.alfa_romeo_33_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_75),context.getString(R.string.alfa_romeo_75_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_145),context.getString(R.string.alfa_romeo_145_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_146),context.getString(R.string.alfa_romeo_146_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_147),context.getString(R.string.alfa_romeo_147_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_155),context.getString(R.string.alfa_romeo_155_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_156),context.getString(R.string.alfa_romeo_156_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_159),context.getString(R.string.alfa_romeo_159_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_164),context.getString(R.string.alfa_romeo_164_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_166),context.getString(R.string.alfa_romeo_166_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_8c),context.getString(R.string.alfa_romeo_8c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_90),context.getString(R.string.alfa_romeo_90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_gt),context.getString(R.string.alfa_romeo_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_gtv),context.getString(R.string.alfa_romeo_gtv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_rz),context.getString(R.string.alfa_romeo_rz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_sz),context.getString(R.string.alfa_romeo_sz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_arna),context.getString(R.string.alfa_romeo_arna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_brera),context.getString(R.string.alfa_romeo_brera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_giulietta),context.getString(R.string.alfa_romeo_giulietta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_giulia),context.getString(R.string.alfa_romeo_giulia_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_spider),context.getString(R.string.alfa_romeo_spider_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_mito),context.getString(R.string.alfa_romeo_mito_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_4c),context.getString(R.string.alfa_romeo_4c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.alfa_romeo_other),context.getString(R.string.alfa_romeo_other_s)));
        }
        if (carMake.equals(context.getString(R.string.pontiac)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_6000),context.getString(R.string.pontiac_6000_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g5),context.getString(R.string.pontiac_g5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g6),context.getString(R.string.pontiac_g6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g8),context.getString(R.string.pontiac_g8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_gto),context.getString(R.string.pontiac_gto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_aztek),context.getString(R.string.pontiac_aztek_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_parisian),context.getString(R.string.pontiac_parisian_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_bonneville),context.getString(R.string.pontiac_bonneville_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_trans_sport),context.getString(R.string.pontiac_trans_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_tempest),context.getString(R.string.pontiac_tempest_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_grand_am),context.getString(R.string.pontiac_grand_am_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_gto_grand_prix),context.getString(R.string.pontiac_gto_grand_prix_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_g4),context.getString(R.string.pontiac_g4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_solstice),context.getString(R.string.pontiac_solstice_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_sunbrid),context.getString(R.string.pontiac_sunbrid_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_vibe),context.getString(R.string.pontiac_vibe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_firebird),context.getString(R.string.pontiac_firebird_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_fiero),context.getString(R.string.pontiac_fiero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_phoenix),context.getString(R.string.pontiac_phoenix_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_le_mans),context.getString(R.string.pontiac_le_mans_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_montana),context.getString(R.string.pontiac_montana_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_roadster),context.getString(R.string.pontiac_roadster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pontiac_other),context.getString(R.string.pontiac_other_s)));

        }
        if (carMake.equals(context.getString(R.string.peugeot)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_1xx),context.getString(R.string.peugeot_1xx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_104),context.getString(R.string.peugeot_104_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_106),context.getString(R.string.peugeot_106_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_107),context.getString(R.string.peugeot_107_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_2xx),context.getString(R.string.peugeot_2xx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_204),context.getString(R.string.peugeot_204_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_205),context.getString(R.string.peugeot_205_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_206),context.getString(R.string.peugeot_206_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_207),context.getString(R.string.peugeot_207_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_208),context.getString(R.string.peugeot_208_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_3xx),context.getString(R.string.peugeot_3xx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_301),context.getString(R.string.peugeot_301_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_304),context.getString(R.string.peugeot_304_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_305),context.getString(R.string.peugeot_305_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_306),context.getString(R.string.peugeot_306_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_307),context.getString(R.string.peugeot_307_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_308),context.getString(R.string.peugeot_308_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_309),context.getString(R.string.peugeot_309_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_3008),context.getString(R.string.peugeot_3008_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_4xx),context.getString(R.string.peugeot_4xx_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_405),context.getString(R.string.Peugeot_405_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_406),context.getString(R.string.Peugeot_406_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_407),context.getString(R.string.Peugeot_407_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_408),context.getString(R.string.Peugeot_408_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_4007),context.getString(R.string.Peugeot_4007_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_5xx),context.getString(R.string.Peugeot_5xx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_504),context.getString(R.string.Peugeot_504_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_505),context.getString(R.string.Peugeot_505_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.Peugeot_508),context.getString(R.string.Peugeot_508_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_5008),context.getString(R.string.peugeot_5008_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_6xx),context.getString(R.string.peugeot_6xx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_604),context.getString(R.string.peugeot_604_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_605),context.getString(R.string.peugeot_605_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_607),context.getString(R.string.peugeot_607_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_8xx),context.getString(R.string.peugeot_8xx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_806),context.getString(R.string.peugeot_806_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_807),context.getString(R.string.peugeot_807_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_rc),context.getString(R.string.peugeot_rc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_rcz),context.getString(R.string.peugeot_rcz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_1007),context.getString(R.string.peugeot_1007_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_2008),context.getString(R.string.peugeot_2008_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_partner),context.getString(R.string.peugeot_partner_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_boxer),context.getString(R.string.peugeot_boxer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.peugeot_other),context.getString(R.string.peugeot_other_s)));

        }
        if (carMake.equals(context.getString(R.string.jaguar)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_e_pace),context.getString(R.string.jaguar_e_pace_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_e_type),context.getString(R.string.jaguar_e_type_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_f_pace),context.getString(R.string.jaguar_f_pace_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_f_type),context.getString(R.string.jaguar_f_type_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_s_type),context.getString(R.string.jaguar_s_type_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_x_type),context.getString(R.string.jaguar_x_type_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xe),context.getString(R.string.jaguar_xe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xf),context.getString(R.string.jaguar_xf_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xfr),context.getString(R.string.jaguar_xfr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xj),context.getString(R.string.jaguar_xj_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xj220),context.getString(R.string.jaguar_xj220_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xjr),context.getString(R.string.jaguar_xjr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xjs),context.getString(R.string.jaguar_xjs_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xk),context.getString(R.string.jaguar_xk_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xkr_s),context.getString(R.string.jaguar_xkr_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xkr),context.getString(R.string.jaguar_xkr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_daimler_double_six),context.getString(R.string.jaguar_daimler_double_six_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_daimler),context.getString(R.string.jaguar_daimler_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_ss100),context.getString(R.string.jaguar_ss100_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_xj8),context.getString(R.string.jaguar_xj8_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.jaguar_other),context.getString(R.string.jaguar_other_s)));
        }
        if (carMake.equals(context.getString(R.string.great_wall)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_c30),context.getString(R.string.great_wall_c30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_m2),context.getString(R.string.great_wall_m2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_m4),context.getString(R.string.great_wall_m4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_peri),context.getString(R.string.great_wall_peri_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_pegasus),context.getString(R.string.great_wall_pegasus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_deer),context.getString(R.string.great_wall_deer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_safe),context.getString(R.string.great_wall_safe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_sailor),context.getString(R.string.great_wall_sailor_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_socool),context.getString(R.string.great_wall_socool_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_florid),context.getString(R.string.great_wall_florid_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_voleex),context.getString(R.string.great_wall_voleex_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_cowry),context.getString(R.string.great_wall_cowry_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_coolbear),context.getString(R.string.great_wall_coolbear_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_hover),context.getString(R.string.great_wall_hover_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_wingle),context.getString(R.string.great_wall_wingle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_haval),context.getString(R.string.great_wall_haval_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.great_wall_other),context.getString(R.string.great_wall_other_s)));
        }
        if (carMake.equals(context.getString(R.string.gmc)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_acadia),context.getString(R.string.gmc_acadia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_envoy),context.getString(R.string.gmc_envoy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_typhoon),context.getString(R.string.gmc_typhoon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_terrain),context.getString(R.string.gmc_terrain_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_jimmy),context.getString(R.string.gmc_jimmy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_savana),context.getString(R.string.gmc_savana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_statesman),context.getString(R.string.gmc_statesman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_safari),context.getString(R.string.gmc_safari_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_suburban),context.getString(R.string.gmc_suburban_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_sierra),context.getString(R.string.gmc_sierra_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_vandura),context.getString(R.string.gmc_vandura_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_caprice),context.getString(R.string.gmc_caprice_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_calais),context.getString(R.string.gmc_calais_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_canyon),context.getString(R.string.gmc_canyon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_cruze),context.getString(R.string.gmc_cruze_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_commodore),context.getString(R.string.gmc_commodore_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_yokon),context.getString(R.string.gmc_yokon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.gmc_caballero),context.getString(R.string.gmc_caballero_s)));

        }
        if (carMake.equals(context.getString(R.string.jeep)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_patriot),context.getString(R.string.jeep_patriot_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_grand_cherokee),context.getString(R.string.jeep_grand_cherokee_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_wrangler),context.getString(R.string.jeep_wrangler_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_renegade),context.getString(R.string.jeep_renegade_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_cherokee),context.getString(R.string.jeep_cherokee_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_commander),context.getString(R.string.jeep_commander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_comanche),context.getString(R.string.jeep_comanche_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_laredo),context.getString(R.string.jeep_laredo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_liberty),context.getString(R.string.jeep_liberty_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_wagoneer),context.getString(R.string.jeep_wagoneer_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_gldiator),context.getString(R.string.jeep_gldiator_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jeep_other),context.getString(R.string.jeep_other_s)));
        }
        if (carMake.equals(context.getString(R.string.daihatsu)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_yrv),context.getString(R.string.daihatsu_yrv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_applause),context.getString(R.string.daihatsu_applause_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_atrai),context.getString(R.string.daihatsu_atrai_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_alits),context.getString(R.string.daihatsu_alits_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_opti),context.getString(R.string.daihatsu_opti_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_esse),context.getString(R.string.daihatsu_esse_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_boon),context.getString(R.string.daihatsu_boon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_perodua_viva),context.getString(R.string.daihatsu_perodua_viva_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_bazar),context.getString(R.string.daihatsu_bazar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_taft),context.getString(R.string.daihatsu_taft_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_tanto),context.getString(R.string.daihatsu_tanto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_trevis),context.getString(R.string.daihatsu_trevis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_charade),context.getString(R.string.daihatsu_charade_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_charmant),context.getString(R.string.daihatsu_charmant_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_terios),context.getString(R.string.daihatsu_terios_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_grand_terios),context.getString(R.string.daihatsu_grand_terios_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_delta),context.getString(R.string.daihatsu_delta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_rocky),context.getString(R.string.daihatsu_rocky_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_xenia),context.getString(R.string.daihatsu_xenia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_storia),context.getString(R.string.daihatsu_storia_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_sonica),context.getString(R.string.daihatsu_sonica_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_ceria),context.getString(R.string.daihatsu_ceria_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_sirion),context.getString(R.string.daihatsu_sirion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_feroza),context.getString(R.string.daihatsu_feroza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_kancil),context.getString(R.string.daihatsu_kancil_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_copen),context.getString(R.string.daihatsu_copen_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_cuore),context.getString(R.string.daihatsu_cuore_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_leeza),context.getString(R.string.daihatsu_leeza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_materia),context.getString(R.string.daihatsu_materia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_move),context.getString(R.string.daihatsu_move_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_mira),context.getString(R.string.daihatsu_mira_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_fourtrak),context.getString(R.string.daihatsu_fourtrak_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daihatsu_other),context.getString(R.string.daihatsu_other_s)));
        }
        if (carMake.equals(context.getString(R.string.daewoo)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_g2x),context.getString(R.string.daewoo_g2x_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_arcadia),context.getString(R.string.daewoo_arcadia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_espero),context.getString(R.string.daewoo_espero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_istana),context.getString(R.string.daewoo_istana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_evanda),context.getString(R.string.daewoo_evanda_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_prince),context.getString(R.string.daewoo_prince_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_tacuma),context.getString(R.string.daewoo_tacuma_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_tosca),context.getString(R.string.daewoo_tosca_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_tico),context.getString(R.string.daewoo_tico_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_juliet),context.getString(R.string.daewoo_juliet_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_gentra),context.getString(R.string.daewoo_gentra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_damas),context.getString(R.string.daewoo_damas_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_racer),context.getString(R.string.daewoo_racer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_rezzo),context.getString(R.string.daewoo_rezzo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_zaz),context.getString(R.string.daewoo_zaz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_statesman),context.getString(R.string.daewoo_statesman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_super_salon),context.getString(R.string.daewoo_super_salon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_cielo),context.getString(R.string.daewoo_cielo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_chairman),context.getString(R.string.daewoo_chairman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_kalos),context.getString(R.string.daewoo_kalos_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_labo),context.getString(R.string.daewoo_labo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_lacetti),context.getString(R.string.daewoo_lacetti_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_lanos),context.getString(R.string.daewoo_lanos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_lanos_1),context.getString(R.string.daewoo_lanos_1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_leganza),context.getString(R.string.daewoo_leganza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_lemans),context.getString(R.string.daewoo_lemans_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_matiz),context.getString(R.string.daewoo_matiz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_magnus),context.getString(R.string.daewoo_magnus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_musso),context.getString(R.string.daewoo_musso_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_nexia),context.getString(R.string.daewoo_nexia_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_nubira),context.getString(R.string.daewoo_nubira_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_windstorm),context.getString(R.string.daewoo_windstorm_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_bf_106),context.getString(R.string.daewoo_bf_106_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.daewoo_other),context.getString(R.string.daewoo_other_s)));
        }
        if (carMake.equals(context.getString(R.string.dodge)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_avenger),context.getString(R.string.dodge_avenger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_intrepid),context.getString(R.string.dodge_intrepid_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_charger),context.getString(R.string.dodge_charger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_challenger),context.getString(R.string.dodge_challenger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_journey),context.getString(R.string.dodge_journey_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_dakota),context.getString(R.string.dodge_dakota_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_daytona),context.getString(R.string.dodge_daytona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_durango),context.getString(R.string.dodge_durango_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_dynasty),context.getString(R.string.dodge_dynasty_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_ram),context.getString(R.string.dodge_ram_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_spirit),context.getString(R.string.dodge_spirit_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_stratus),context.getString(R.string.dodge_stratus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_stealth),context.getString(R.string.dodge_stealth_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_shadow),context.getString(R.string.dodge_shadow_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_grand_caravan),context.getString(R.string.dodge_grand_caravan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_caliber),context.getString(R.string.dodge_caliber_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_magnum),context.getString(R.string.dodge_magnum_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_monaco),context.getString(R.string.dodge_monaco_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_nitro),context.getString(R.string.dodge_nitro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_neon),context.getString(R.string.dodge_neon_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_dart),context.getString(R.string.dodge_dart_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_power_wagon),context.getString(R.string.dodge_power_wagon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dodge_other),context.getString(R.string.dodge_other_s)));
        }
        if (carMake.equals(context.getString(R.string.rover)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_lr4),context.getString(R.string.land_rover_lr4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_discovery),context.getString(R.string.land_rover_discovery_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_discovery_sport),context.getString(R.string.land_rover_discovery_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_defender),context.getString(R.string.land_rover_defender_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_hse),context.getString(R.string.land_rover_range_rover_hse_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_evoque),context.getString(R.string.land_rover_range_rover_evoque_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_sport),context.getString(R.string.land_rover_range_rover_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_vogue),context.getString(R.string.land_rover_range_rover_vogue_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_velar),context.getString(R.string.land_rover_range_rover_velar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover),context.getString(R.string.land_rover_range_rover_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_freelander),context.getString(R.string.land_rover_freelander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_other),context.getString(R.string.land_rover_other_s)));
        }
        if (carMake.equals(context.getString(R.string.rolls_royce)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_park_ward),context.getString(R.string.rolls_royce_park_ward_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_wraith),context.getString(R.string.rolls_royce_wraith_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_silver_spur),context.getString(R.string.rolls_royce_silver_spur_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_ghost),context.getString(R.string.rolls_royce_ghost_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_phantom),context.getString(R.string.rolls_royce_phantom_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_corniche),context.getString(R.string.rolls_royce_corniche_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_dawn),context.getString(R.string.rolls_royce_dawn_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_pininfarina),context.getString(R.string.rolls_royce_pininfarina_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_silver_spirit),context.getString(R.string.rolls_royce_silver_spirit_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.rolls_royce_other),context.getString(R.string.rolls_royce_other_s)));

        }
        if (carMake.equals(context.getString(R.string.renault)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_4),context.getString(R.string.renault_4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_5),context.getString(R.string.renault_5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_6),context.getString(R.string.renault_6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_9),context.getString(R.string.renault_9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_11),context.getString(R.string.renault_11_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_12),context.getString(R.string.renault_12_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_14),context.getString(R.string.renault_14_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_15),context.getString(R.string.renault_15_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_16),context.getString(R.string.renault_16_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_17),context.getString(R.string.renault_17_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.renault_18),context.getString(R.string.renault_18_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_19),context.getString(R.string.renault_19_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_20),context.getString(R.string.renault_20_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_21),context.getString(R.string.renault_21_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_25),context.getString(R.string.renault_25_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_30),context.getString(R.string.renault_30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_espace),context.getString(R.string.renault_espace_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_avantime),context.getString(R.string.renault_avantime_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_express),context.getString(R.string.renault_express_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_estafette),context.getString(R.string.renault_estafette_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.renault_traviq),context.getString(R.string.renault_traviq_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_twizy),context.getString(R.string.renault_twizy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_twingo),context.getString(R.string.renault_twingo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_duster),context.getString(R.string.renault_duster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_dacia),context.getString(R.string.renault_dacia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_dokker_van),context.getString(R.string.renault_dokker_van_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_rapide),context.getString(R.string.renault_rapide_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_rainbow),context.getString(R.string.renault_rainbow_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_rodeo),context.getString(R.string.renault_rodeo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_zoe),context.getString(R.string.renault_zoe_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.renault_safran),context.getString(R.string.renault_safran_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_sandero),context.getString(R.string.renault_sandero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_sport_spider),context.getString(R.string.renault_sport_spider_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_symbol),context.getString(R.string.renault_symbol_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_scenic),context.getString(R.string.renault_scenic_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_grand_scenic),context.getString(R.string.renault_grand_scenic_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_fluence),context.getString(R.string.renault_fluence_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_fuego),context.getString(R.string.renault_fuego_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_vel_satis),context.getString(R.string.renault_vel_satis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_kangoo),context.getString(R.string.renault_kangoo_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.renault_clio),context.getString(R.string.renault_clio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_koleos),context.getString(R.string.renault_koleos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_latitude),context.getString(R.string.renault_latitude_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_laguna),context.getString(R.string.renault_laguna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_logan),context.getString(R.string.renault_logan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_master),context.getString(R.string.renault_master_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_modus),context.getString(R.string.renault_modus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_megane),context.getString(R.string.renault_megane_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_medallion),context.getString(R.string.renault_medallion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.renault_captur),context.getString(R.string.renault_captur_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.renault_other),context.getString(R.string.renault_other_s)));
        }
        if (carMake.equals(context.getString(R.string.saab)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_x9_2),context.getString(R.string.saad_x9_2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_vector9_7),context.getString(R.string.saad_vector9_7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_x9_7),context.getString(R.string.saad_x9_7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_90),context.getString(R.string.saad_90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_93),context.getString(R.string.saad_93_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_95),context.getString(R.string.saad_95_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_96),context.getString(R.string.saad_96_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_99),context.getString(R.string.saad_99_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_900),context.getString(R.string.saad_900_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saad_9000),context.getString(R.string.saad_9000_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.saad_other),context.getString(R.string.saad_other_s)));
        }
        if (carMake.equals(context.getString(R.string.saturn)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_ls),context.getString(R.string.saturn_ls_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_lw),context.getString(R.string.saturn_lw_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_sc),context.getString(R.string.saturn_sc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_sl),context.getString(R.string.saturn_sl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_outlook),context.getString(R.string.saturn_outlook_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_astra),context.getString(R.string.saturn_astra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_lon),context.getString(R.string.saturn_lon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_aura),context.getString(R.string.saturn_aura_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_relay),context.getString(R.string.saturn_relay_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_sky),context.getString(R.string.saturn_sky_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_view),context.getString(R.string.saturn_view_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saturn_other),context.getString(R.string.saturn_other_s)));
        }
        if (carMake.equals(context.getString(R.string.ssang_yong)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_actyon),context.getString(R.string.ssang_yong_actyon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_tiger),context.getString(R.string.ssang_yong_tiger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_chairman),context.getString(R.string.ssang_yong_chairman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_rodius),context.getString(R.string.ssang_yong_rodius_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_rexton),context.getString(R.string.ssang_yong_rexton_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_family),context.getString(R.string.ssang_yong_family_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_kallista),context.getString(R.string.ssang_yong_kallista_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_kyron),context.getString(R.string.ssang_yong_kyron_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_musso),context.getString(R.string.ssang_yong_musso_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ssang_yong_other),context.getString(R.string.ssang_yong_other_s)));

        }
        if (carMake.equals(context.getString(R.string.citroen)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c),context.getString(R.string.citroen_c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c_zero),context.getString(R.string.citroen_c_zero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c1),context.getString(R.string.citroen_c1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c15),context.getString(R.string.citroen_c15_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c2),context.getString(R.string.citroen_c2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c25),context.getString(R.string.citroen_c25_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c3),context.getString(R.string.citroen_c3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c35),context.getString(R.string.citroen_c35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c4),context.getString(R.string.citroen_c4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c5),context.getString(R.string.citroen_c5_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c6),context.getString(R.string.citroen_c6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c8),context.getString(R.string.citroen_c8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_cx),context.getString(R.string.citroen_cx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ds),context.getString(R.string.citroen_ds_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ds2),context.getString(R.string.citroen_ds2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ds4),context.getString(R.string.citroen_ds4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ds5),context.getString(R.string.citroen_ds5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ds9),context.getString(R.string.citroen_ds9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_g),context.getString(R.string.citroen_g_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_gs),context.getString(R.string.citroen_gs_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_gsa),context.getString(R.string.citroen_gsa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_gt),context.getString(R.string.citroen_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_2cv),context.getString(R.string.citroen_2cv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ax),context.getString(R.string.citroen_ax_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_bx),context.getString(R.string.citroen_bx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ln),context.getString(R.string.citroen_ln_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_lna),context.getString(R.string.citroen_lna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_xm),context.getString(R.string.citroen_xm_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_zx),context.getString(R.string.citroen_zx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_ami),context.getString(R.string.citroen_ami_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_acadiane),context.getString(R.string.citroen_acadiane_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_xsara),context.getString(R.string.citroen_xsara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_xsara_picasso),context.getString(R.string.citroen_xsara_picasso_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_xantia),context.getString(R.string.citroen_xantia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_evasion),context.getString(R.string.citroen_evasion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_berlingo),context.getString(R.string.citroen_berlingo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c3_picasso),context.getString(R.string.citroen_c3_picasso_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c4_picasso),context.getString(R.string.citroen_c4_picasso_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_jumper),context.getString(R.string.citroen_jumper_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_jumpy),context.getString(R.string.citroen_jumpy_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_dyane),context.getString(R.string.citroen_dyane_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_saxo),context.getString(R.string.citroen_saxo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_c_crosser),context.getString(R.string.citroen_c_crosse_sr)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_synergie),context.getString(R.string.citroen_synergie_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_faf),context.getString(R.string.citroen_faf_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_visa),context.getString(R.string.citroen_visa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_mehari),context.getString(R.string.citroen_mehari_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_nemo),context.getString(R.string.citroen_nemo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.citroen_other),context.getString(R.string.citroen_other_s)));
        }
        if (carMake.equals(context.getString(R.string.skoda)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_120_gls),context.getString(R.string.skoda_120_gls_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_octavia),context.getString(R.string.skoda_octavia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_praktik),context.getString(R.string.skoda_praktik_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_rapide),context.getString(R.string.skoda_rapide_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_roomster),context.getString(R.string.skoda_roomster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_superb),context.getString(R.string.skoda_superb_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_fabia),context.getString(R.string.skoda_fabia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_favorit),context.getString(R.string.skoda_favorit_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_forman),context.getString(R.string.skoda_forman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_felicia),context.getString(R.string.skoda_felicia_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_felicia_combi),context.getString(R.string.skoda_felicia_combi_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_yeti),context.getString(R.string.skoda_yeti_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.skoda_other),context.getString(R.string.skoda_other_s)));
        }
        if (carMake.equals(context.getString(R.string.subaru)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_r1),context.getString(R.string.subaru_r1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_r2),context.getString(R.string.subaru_r2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_sti),context.getString(R.string.subaru_sti_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_svx),context.getString(R.string.subaru_svx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_wrx),context.getString(R.string.subaru_wrx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_xt),context.getString(R.string.subaru_xt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_xv),context.getString(R.string.subaru_xv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_outback),context.getString(R.string.subaru_outback_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_alcyone),context.getString(R.string.subaru_alcyone_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_exiga),context.getString(R.string.subaru_exiga_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_impreza),context.getString(R.string.subaru_impreza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_baja),context.getString(R.string.subaru_baja_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_pleo),context.getString(R.string.subaru_pleo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_bistro),context.getString(R.string.subaru_bistro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_traviq),context.getString(R.string.subaru_traviq_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_tribeca),context.getString(R.string.subaru_tribeca_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_trezia),context.getString(R.string.subaru_trezia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_justy),context.getString(R.string.subaru_justy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_domingo),context.getString(R.string.subaru_domingo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_dias),context.getString(R.string.subaru_dias_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_dex),context.getString(R.string.subaru_dex_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_stella),context.getString(R.string.subaru_stella_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_forester),context.getString(R.string.subaru_forester_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_vivio),context.getString(R.string.subaru_vivio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_lucra),context.getString(R.string.subaru_lucra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_libero),context.getString(R.string.subaru_libero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_legacy),context.getString(R.string.subaru_legacy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.subaru_other),context.getString(R.string.subaru_other_s)));
        }
        if (carMake.equals(context.getString(R.string.suzuki)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_apv),context.getString(R.string.suzuki_apv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_sx4),context.getString(R.string.suzuki_sx4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_x90),context.getString(R.string.suzuki_x90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_xl7),context.getString(R.string.suzuki_xl7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_wagon_r),context.getString(R.string.suzuki_wagon_r_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_alto),context.getString(R.string.suzuki_alto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_mr_wagon),context.getString(R.string.suzuki_mr_wagon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_ertiga),context.getString(R.string.suzuki_ertiga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_ideal),context.getString(R.string.suzuki_ideal_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_aerio),context.getString(R.string.suzuki_aerio_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_ignis),context.getString(R.string.suzuki_ignis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_every),context.getString(R.string.suzuki_every_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_every_landy),context.getString(R.string.suzuki_every_landy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_baleno),context.getString(R.string.suzuki_baleno_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_grand_vitara),context.getString(R.string.suzuki_grand_vitara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_jimny),context.getString(R.string.suzuki_jimny_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_reno),context.getString(R.string.suzuki_reno_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_samurai),context.getString(R.string.suzuki_samurai_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_sidekick),context.getString(R.string.suzuki_sidekick_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_splash),context.getString(R.string.suzuki_splash_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_super_carry),context.getString(R.string.suzuki_super_carry_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_swift),context.getString(R.string.suzuki_swift_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_ciaz),context.getString(R.string.suzuki_ciaz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_cervo),context.getString(R.string.suzuki_cervo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_celerio),context.getString(R.string.suzuki_celerio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_forenza),context.getString(R.string.suzuki_forenza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_vitara),context.getString(R.string.suzuki_vitara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_verona),context.getString(R.string.suzuki_verona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_cappuccino),context.getString(R.string.suzuki_cappuccino_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_cultus_wagon),context.getString(R.string.suzuki_cultus_wagon_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_kei),context.getString(R.string.suzuki_kei_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_kizashi),context.getString(R.string.suzuki_kizashi_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_liana),context.getString(R.string.suzuki_liana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_carry),context.getString(R.string.suzuki_carry_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_sj_samurai),context.getString(R.string.suzuki_sj_samurai_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.suzuki_other),context.getString(R.string.suzuki_other_s)));
        }
        if (carMake.equals(context.getString(R.string.seat)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_132),context.getString(R.string.seat_132_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_133),context.getString(R.string.seat_133_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_altea),context.getString(R.string.seat_altea_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_ibiza),context.getString(R.string.seat_ibiza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_arosa),context.getString(R.string.seat_arosa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_exeo),context.getString(R.string.seat_exeo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_alhambra),context.getString(R.string.seat_alhambra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_toledo),context.getString(R.string.seat_toledo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_terra),context.getString(R.string.seat_terra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_ronda),context.getString(R.string.seat_ronda_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.seat_fura),context.getString(R.string.seat_fura_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_cordoba),context.getString(R.string.seat_cordoba_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_leone),context.getString(R.string.seat_leone_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_marbella),context.getString(R.string.seat_marbella_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.seat_other),context.getString(R.string.seat_other_s)));
        }
        if (carMake.equals(context.getString(R.string.chery)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_a11),context.getString(R.string.chery_a11_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_a113),context.getString(R.string.chery_a113_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_a5),context.getString(R.string.chery_a5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_a620),context.getString(R.string.chery_a620_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_b11),context.getString(R.string.chery_b11_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_m11),context.getString(R.string.chery_m11_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_qq),context.getString(R.string.chery_qq_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_qq6),context.getString(R.string.chery_qq6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_amulet),context.getString(R.string.chery_amulet_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_oriental_sun),context.getString(R.string.chery_oriental_sun_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chery_tiggo),context.getString(R.string.chery_tiggo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_fura),context.getString(R.string.chery_fura_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_cross_easter),context.getString(R.string.chery_cross_easter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chery_other),context.getString(R.string.chery_other_s)));
        }
        if (carMake.equals(context.getString(R.string.chevrolat)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_c10),context.getString(R.string.chevrolet_c10_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_hhr),context.getString(R.string.chevrolet_hhr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_luv_d_max),context.getString(R.string.chevrolet_luv_d_max_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_s_10),context.getString(R.string.chevrolet_s_10_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_ssr),context.getString(R.string.chevrolet_ssr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_astra),context.getString(R.string.chevrolet_astra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_aveo),context.getString(R.string.chevrolet_aveo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_omega),context.getString(R.string.chevrolet_omega_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_uplander),context.getString(R.string.chevrolet_uplander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_epica),context.getString(R.string.chevrolet_epica_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_express),context.getString(R.string.chevrolet_express_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_astro),context.getString(R.string.chevrolet_astro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_avalanche),context.getString(R.string.chevrolet_avalanche_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_explorer),context.getString(R.string.chevrolet_explorer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_equinox),context.getString(R.string.chevrolet_equinox_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_alero),context.getString(R.string.chevrolet_alero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_impala),context.getString(R.string.chevrolet_impala_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_optra),context.getString(R.string.chevrolet_optra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_evenda),context.getString(R.string.chevrolet_evenda_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_prizm),context.getString(R.string.chevrolet_prizm_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_blazer),context.getString(R.string.chevrolet_blazer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_bolt),context.getString(R.string.chevrolet_bolt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_beretta),context.getString(R.string.chevrolet_beretta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_bel_air),context.getString(R.string.chevrolet_bel_air_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_travera),context.getString(R.string.chevrolet_travera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_tracker),context.getString(R.string.chevrolet_tracker_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_trax),context.getString(R.string.chevrolet_trax_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_trans_sport),context.getString(R.string.chevrolet_trans_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_trailblazer),context.getString(R.string.chevrolet_trailblazer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_geo_storm),context.getString(R.string.chevrolet_geo_storm_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_rezzo),context.getString(R.string.chevrolet_rezzo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_zafira),context.getString(R.string.chevrolet_zafira_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_sail),context.getString(R.string.chevrolet_sail_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_spark),context.getString(R.string.chevrolet_spark_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_sprint),context.getString(R.string.chevrolet_sprint_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_silverado),context.getString(R.string.chevrolet_silverado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_suburban),context.getString(R.string.chevrolet_suburban_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_sonic),context.getString(R.string.chevrolet_sonic_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_celta),context.getString(R.string.chevrolet_celta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_celebrity),context.getString(R.string.chevrolet_celebrity_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_chevette),context.getString(R.string.chevrolet_chevette_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_van),context.getString(R.string.chevrolet_van_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_frontera),context.getString(R.string.chevrolet_frontera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_volt),context.getString(R.string.chevrolet_volt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_vectra),context.getString(R.string.chevrolet_vectra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_venture),context.getString(R.string.chevrolet_venture_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_captiva),context.getString(R.string.chevrolet_captiva_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_caprice),context.getString(R.string.chevrolet_caprice_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_caprice_classic),context.getString(R.string.chevrolet_caprice_classic_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_cavalier),context.getString(R.string.chevrolet_cavalier_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_cruze),context.getString(R.string.chevrolet_cruze_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_camaro),context.getString(R.string.chevrolet_camaro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_cobalt),context.getString(R.string.chevrolet_cobalt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_corsa),context.getString(R.string.chevrolet_corsa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_corsica),context.getString(R.string.chevrolet_corsica_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_covette),context.getString(R.string.chevrolet_covette_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_colorado),context.getString(R.string.chevrolet_colorado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_lacetti),context.getString(R.string.chevrolet_lacetti_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_lanos),context.getString(R.string.chevrolet_lanos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_lumina),context.getString(R.string.chevrolet_lumina_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_malibu),context.getString(R.string.chevrolet_malibu_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_metro),context.getString(R.string.chevrolet_metro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_monte_carlo),context.getString(R.string.chevrolet_monte_carlo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_monza),context.getString(R.string.chevrolet_monza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_nubira),context.getString(R.string.chevrolet_nubira_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_niva),context.getString(R.string.chevrolet_niva_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_3100),context.getString(R.string.chevrolet_3100_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_4500),context.getString(R.string.chevrolet_4500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_c1500),context.getString(R.string.chevrolet_c1500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_cheyenne),context.getString(R.string.chevrolet_cheyenne_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_cr8),context.getString(R.string.chevrolet_cr8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_el_camino),context.getString(R.string.chevrolet_el_camino_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chevrolet_other),context.getString(R.string.chevrolet_other_s)));
        }
        if (carMake.equals(context.getString(R.string.ford)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_c_max),context.getString(R.string.ford_c_max_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_f_150),context.getString(R.string.ford_f_150_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_f_250),context.getString(R.string.ford_f_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_f_350),context.getString(R.string.ford_f_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_gt),context.getString(R.string.ford_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_aurion),context.getString(R.string.ford_aurion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_aerostar),context.getString(R.string.ford_aerostar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_escort),context.getString(R.string.ford_escort_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_explorer),context.getString(R.string.ford_explorer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_s_max),context.getString(R.string.ford_s_max_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ford_aspire),context.getString(R.string.ford_aspire_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_escape),context.getString(R.string.ford_escape_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_expedition),context.getString(R.string.ford_expedition_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_excursion),context.getString(R.string.ford_excursion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_edge),context.getString(R.string.ford_edge_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_everest),context.getString(R.string.ford_everest_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_econoline),context.getString(R.string.ford_econoline_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_ecosport),context.getString(R.string.ford_ecosport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_econovan),context.getString(R.string.ford_econovan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_bronco),context.getString(R.string.ford_bronco_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ford_puma),context.getString(R.string.ford_puma_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_taunus),context.getString(R.string.ford_taunus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_transit),context.getString(R.string.ford_transit_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_tourneo_connect),context.getString(R.string.ford_tourneo_connect_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_tempo),context.getString(R.string.ford_tempo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_thunder_bird),context.getString(R.string.ford_thunder_bird_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_raptor),context.getString(R.string.ford_raptor_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_ranger),context.getString(R.string.ford_ranger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_sport_trac),context.getString(R.string.ford_sport_trac_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_sport_truck_explorer),context.getString(R.string.ford_sport_truck_explorer_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ford_scorpio),context.getString(R.string.ford_scorpio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_sierra),context.getString(R.string.ford_sierra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_shelby),context.getString(R.string.ford_shelby_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_galaxy),context.getString(R.string.ford_galaxy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_granada),context.getString(R.string.ford_granada_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_five_hundred),context.getString(R.string.ford_five_hundred_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_freestyle),context.getString(R.string.ford_freestyle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_focus),context.getString(R.string.ford_focus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_fox_rs),context.getString(R.string.ford_fox_rs_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_figo),context.getString(R.string.ford_figo_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ford_fusion),context.getString(R.string.ford_fusion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_fiesta),context.getString(R.string.ford_fiesta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_ka),context.getString(R.string.ford_ka_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_capri),context.getString(R.string.ford_capri_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_cougar),context.getString(R.string.ford_cougar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_crown_victoria),context.getString(R.string.ford_crown_victoria_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_kuga),context.getString(R.string.ford_kuga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_courier),context.getString(R.string.ford_courier_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_contour),context.getString(R.string.ford_contour_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_consul),context.getString(R.string.ford_consul_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ford_laser),context.getString(R.string.ford_laser_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_maverick),context.getString(R.string.ford_maverick_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_mustang),context.getString(R.string.ford_mustang_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_mondeo),context.getString(R.string.ford_mondeo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_windstar),context.getString(R.string.ford_windstar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_f550),context.getString(R.string.ford_f550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_f450),context.getString(R.string.ford_f450_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_e_350),context.getString(R.string.ford_e_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_e_450),context.getString(R.string.ford_e_450_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_flex),context.getString(R.string.ford_flex_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ford_ltd),context.getString(R.string.ford_ltd_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_model_40),context.getString(R.string.ford_model_40_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_model_a),context.getString(R.string.ford_model_a_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_t_bucket),context.getString(R.string.ford_t_bucket_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ford_other),context.getString(R.string.ford_other_s)));
        }
        if (carMake.equals(context.getString(R.string.volvo)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_c),context.getString(R.string.volvo_c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_c30),context.getString(R.string.volvo_c30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_c70),context.getString(R.string.volvo_c70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_car_s),context.getString(R.string.volvo_car_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_s40),context.getString(R.string.volvo_s40_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_s60),context.getString(R.string.volvo_s60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_s70),context.getString(R.string.volvo_s70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_s80),context.getString(R.string.volvo_s80_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_s90),context.getString(R.string.volvo_s90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_v),context.getString(R.string.volvo_v_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_v40),context.getString(R.string.volvo_v40_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_v50),context.getString(R.string.volvo_v50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_v60),context.getString(R.string.volvo_v60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_v70),context.getString(R.string.volvo_v70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_v90),context.getString(R.string.volvo_v90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_xc),context.getString(R.string.volvo_xc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_xc60),context.getString(R.string.volvo_xc60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_xc70),context.getString(R.string.volvo_xc70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_xc90),context.getString(R.string.volvo_xc90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_66),context.getString(R.string.volvo_66_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_140),context.getString(R.string.volvo_140_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_164),context.getString(R.string.volvo_164_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_240),context.getString(R.string.volvo_240_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_260),context.getString(R.string.volvo_260_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_340),context.getString(R.string.volvo_340_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_360),context.getString(R.string.volvo_360_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_440),context.getString(R.string.volvo_440_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_460),context.getString(R.string.volvo_460_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_480),context.getString(R.string.volvo_480_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_740),context.getString(R.string.volvo_740_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_760),context.getString(R.string.volvo_760_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_780),context.getString(R.string.volvo_780_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_850),context.getString(R.string.volvo_850_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_940),context.getString(R.string.volvo_940_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_960),context.getString(R.string.volvo_960_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_laplander),context.getString(R.string.volvo_laplander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_marcopolo),context.getString(R.string.volvo_marcopolo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_p1800),context.getString(R.string.volvo_p1800_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volvo_other),context.getString(R.string.volvo_other_s)));
        }
        if (carMake.equals(context.getString(R.string.volkswagen)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_cc),context.getString(R.string.volkswagen_cc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_gti),context.getString(R.string.volkswagen_gti_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_w12),context.getString(R.string.volkswagen_w12_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_eos),context.getString(R.string.volkswagen_eos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_lltis),context.getString(R.string.volkswagen_lltis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_amarok),context.getString(R.string.volkswagen_amarok_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_e_golf),context.getString(R.string.volkswagen_e_golf_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_parati),context.getString(R.string.volkswagen_parati_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_passat),context.getString(R.string.volkswagen_passat_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_bora),context.getString(R.string.volkswagen_bora_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_polo),context.getString(R.string.volkswagen_polo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_pointer),context.getString(R.string.volkswagen_pointer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_beetle),context.getString(R.string.volkswagen_beetle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_taro),context.getString(R.string.volkswagen_taro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_transporter),context.getString(R.string.volkswagen_transporter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_touran),context.getString(R.string.volkswagen_touran_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_tiguan),context.getString(R.string.volkswagen_tiguan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_golf),context.getString(R.string.volkswagen_golf_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_golf_r),context.getString(R.string.volkswagen_golf_r_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_golf_plus),context.getString(R.string.volkswagen_golf_plus_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_jetta),context.getString(R.string.volkswagen_jetta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_routan),context.getString(R.string.volkswagen_routan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_saveiro),context.getString(R.string.volkswagen_saveiro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_santana),context.getString(R.string.volkswagen_santana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_suran),context.getString(R.string.volkswagen_suran_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_scirocco),context.getString(R.string.volkswagen_scirocco_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_sharan),context.getString(R.string.volkswagen_sharan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_touareg),context.getString(R.string.volkswagen_touareg_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_gol),context.getString(R.string.volkswagen_gol_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_phaeton),context.getString(R.string.volkswagen_phaeton_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_fox),context.getString(R.string.volkswagen_fox_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_vento),context.getString(R.string.volkswagen_vento_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_caddy),context.getString(R.string.volkswagen_caddy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_caravelle),context.getString(R.string.volkswagen_caravelle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_california),context.getString(R.string.volkswagen_california_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_crafter),context.getString(R.string.volkswagen_crafter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_crossfox),context.getString(R.string.volkswagen_crossfox_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_corrado),context.getString(R.string.volkswagen_corrado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_lupo),context.getString(R.string.volkswagen_lupo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_multivan),context.getString(R.string.volkswagen_multivan_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_1500),context.getString(R.string.volkswagen_1500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_lt),context.getString(R.string.volkswagen_lt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_passat_cc),context.getString(R.string.volkswagen_passat_cc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_t3_caravelle),context.getString(R.string.volkswagen_t3_caravelle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.volkswagen_other),context.getString(R.string.volkswagen_other_s)));
        }
        if (carMake.equals(context.getString(R.string.fiat)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_124),context.getString(R.string.fiat_124_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_126),context.getString(R.string.fiat_126_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_127),context.getString(R.string.fiat_127_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_131),context.getString(R.string.fiat_131_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_500),context.getString(R.string.fiat_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_500e),context.getString(R.string.fiat_500e_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_600),context.getString(R.string.fiat_600_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_x_1_9),context.getString(R.string.fiat_x_1_9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_argenta),context.getString(R.string.fiat_argenta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_ulysse),context.getString(R.string.fiat_ulysse_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_uno),context.getString(R.string.fiat_uno_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_albea),context.getString(R.string.fiat_albea_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_idea),context.getString(R.string.fiat_idea_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_barchetta),context.getString(R.string.fiat_barchetta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_palio),context.getString(R.string.fiat_palio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_panda),context.getString(R.string.fiat_panda_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_bravo),context.getString(R.string.fiat_bravo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_bolognese),context.getString(R.string.fiat_bolognese_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_punto),context.getString(R.string.fiat_punto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_petra),context.getString(R.string.fiat_petra_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_tipo),context.getString(R.string.fiat_tipo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_tempra),context.getString(R.string.fiat_tempra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_grande_punto),context.getString(R.string.fiat_grande_punto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_doblo),context.getString(R.string.fiat_doblo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_dukato),context.getString(R.string.fiat_dukato_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_duna),context.getString(R.string.fiat_duna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_ritmo),context.getString(R.string.fiat_ritmo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_regata),context.getString(R.string.fiat_regata_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_zastava),context.getString(R.string.fiat_zastava_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_strada),context.getString(R.string.fiat_strada_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_stilo),context.getString(R.string.fiat_stilo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_sedici),context.getString(R.string.fiat_sedici_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_cinquecento),context.getString(R.string.fiat_cinquecento_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_seicento),context.getString(R.string.fiat_seicento_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_siena),context.getString(R.string.fiat_siena_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_florida),context.getString(R.string.fiat_florida_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_fiorino),context.getString(R.string.fiat_fiorino_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_croma),context.getString(R.string.fiat_croma_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_coupe),context.getString(R.string.fiat_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_linea),context.getString(R.string.fiat_linea_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_maria),context.getString(R.string.fiat_maria_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_mulipla),context.getString(R.string.fiat_mulipla_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_nuova_500),context.getString(R.string.fiat_nuova_500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_500c),context.getString(R.string.fiat_500c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_750),context.getString(R.string.fiat_750_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.fiat_other),context.getString(R.string.fiat_other_s)));
        }
        if (carMake.equals(context.getString(R.string.ferrari)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_208),context.getString(R.string.ferrari_208_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_308),context.getString(R.string.ferrari_308_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_328),context.getString(R.string.ferrari_328_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_348),context.getString(R.string.ferrari_348_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_355),context.getString(R.string.ferrari_355_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_360_spider),context.getString(R.string.ferrari_360_spider_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_360_modena),context.getString(R.string.ferrari_360_modena_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_412),context.getString(R.string.ferrari_412_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_430),context.getString(R.string.ferrari_430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_456_gt),context.getString(R.string.ferrari_456_gt_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_458_italia),context.getString(R.string.ferrari_458_italia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_512),context.getString(R.string.ferrari_512_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_550_barchetta),context.getString(R.string.ferrari_550_barchetta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_550_maranello),context.getString(R.string.ferrari_550_maranello_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_575_maranello),context.getString(R.string.ferrari_575_maranello_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_599_gtb_Fiorano),context.getString(R.string.ferrari_599_gtb_Fiorano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_612_scaglietti),context.getString(R.string.ferrari_612_scaglietti_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f340),context.getString(R.string.ferrari_f340_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f355),context.getString(R.string.ferrari_f355_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f40),context.getString(R.string.ferrari_f40_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f430_scuderia),context.getString(R.string.ferrari_f430_scuderia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f430_spider),context.getString(R.string.ferrari_f430_spider_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f50),context.getString(R.string.ferrari_f50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_fxx),context.getString(R.string.ferrari_fxx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_enzo),context.getString(R.string.ferrari_enzo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_testarossa),context.getString(R.string.ferrari_testarossa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_dino),context.getString(R.string.ferrari_dino_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_california),context.getString(R.string.ferrari_california_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_laferrari),context.getString(R.string.ferrari_laferrari_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_mondial),context.getString(R.string.ferrari_mondial_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_246),context.getString(R.string.ferrari_246_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_250),context.getString(R.string.ferrari_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_330),context.getString(R.string.ferrari_330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_360),context.getString(R.string.ferrari_360_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_365),context.getString(R.string.ferrari_365_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_456),context.getString(R.string.ferrari_456_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_488),context.getString(R.string.ferrari_488_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_575),context.getString(R.string.ferrari_575_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_599_gtb),context.getString(R.string.ferrari_599_gtb_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f12),context.getString(R.string.ferrari_f12_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_f430),context.getString(R.string.ferrari_f430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_ff),context.getString(R.string.ferrari_ff_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.ferrari_other),context.getString(R.string.ferrari_other_s)));
        }
        if (carMake.equals(context.getString(R.string.cadillac)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_ats),context.getString(R.string.cadillac_ats_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_bls),context.getString(R.string.cadillac_bls_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_ctc),context.getString(R.string.cadillac_ctc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_dts),context.getString(R.string.cadillac_dts_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_deVille),context.getString(R.string.cadillac_deVille_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_elr),context.getString(R.string.cadillac_elr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_srx),context.getString(R.string.cadillac_srx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_sts),context.getString(R.string.cadillac_sts_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_xlr),context.getString(R.string.cadillac_xlr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_escalade),context.getString(R.string.cadillac_escalade_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_allante),context.getString(R.string.cadillac_allante_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_eldorado),context.getString(R.string.cadillac_eldorado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_brougham),context.getString(R.string.cadillac_brougham_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_seville),context.getString(R.string.cadillac_seville_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_fleetwood),context.getString(R.string.cadillac_fleetwood_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_catera),context.getString(R.string.cadillac_catera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_coupe_deville),context.getString(R.string.cadillac_coupe_deville_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_xts),context.getString(R.string.cadillac_xts_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.cadillac_other),context.getString(R.string.cadillac_other_s)));
        }
        if (carMake.equals(context.getString(R.string.chrysler)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_200),context.getString(R.string.chrysler_200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_300c),context.getString(R.string.chrysler_300c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_300m),context.getString(R.string.chrysler_300m_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_lhs),context.getString(R.string.chrysler_lhs_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_aspen),context.getString(R.string.chrysler_aspen_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_imperial),context.getString(R.string.chrysler_imperial_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_intrepid),context.getString(R.string.chrysler_intrepid_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_pasifica),context.getString(R.string.chrysler_pasifica_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_prowler),context.getString(R.string.chrysler_prowler_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_pt_cruiser),context.getString(R.string.chrysler_pt_cruiser_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_town_country),context.getString(R.string.chrysler_town_country_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_grandvoyager),context.getString(R.string.chrysler_grandvoyager_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_daytona_shelby),context.getString(R.string.chrysler_daytona_shelby_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_saratoga),context.getString(R.string.chrysler_saratoga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_sebring),context.getString(R.string.chrysler_sebring_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_cirrus),context.getString(R.string.chrysler_cirrus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_voyager),context.getString(R.string.chrysler_voyager_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_vision),context.getString(R.string.chrysler_vision_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_fifth_avenue),context.getString(R.string.chrysler_fifth_avenue_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_crossfire),context.getString(R.string.chrysler_crossfire_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_concorde),context.getString(R.string.chrysler_concorde_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_leBaron),context.getString(R.string.chrysler_leBaron_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_nassau),context.getString(R.string.chrysler_nassau_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_neon),context.getString(R.string.chrysler_neon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_new_yorker),context.getString(R.string.chrysler_new_yorker_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_300),context.getString(R.string.chrysler_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_300s),context.getString(R.string.chrysler_300s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.chrysler_other),context.getString(R.string.chrysler_other_s)));
        }
        if (carMake.equals(context.getString(R.string.lada)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_2010),context.getString(R.string.lada_2010_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_2015),context.getString(R.string.lada_2015_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_2107),context.getString(R.string.lada_2107_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_2170),context.getString(R.string.lada_2170_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_aleko),context.getString(R.string.lada_aleko_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_oka),context.getString(R.string.lada_oka_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_samara),context.getString(R.string.lada_samara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_niva),context.getString(R.string.lada_niva_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_vesta),context.getString(R.string.lada_vesta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_vesta_sw),context.getString(R.string.lada_vesta_sw_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lada_granta),context.getString(R.string.lada_granta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_Granta_hb),context.getString(R.string.lada_Granta_hb_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_largus),context.getString(R.string.lada_largus_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_4x4_urban),context.getString(R.string.lada_4x4_urban_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lada_other),context.getString(R.string.lada_other_s)));
        }
        if (carMake.equals(context.getString(R.string.lamborghini)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_lm002),context.getString(R.string.lamborghini_lm002_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_aventador),context.getString(R.string.lamborghini_aventador_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_espada),context.getString(R.string.lamborghini_espada_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_jalpa),context.getString(R.string.lamborghini_jalpa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_diablo),context.getString(R.string.lamborghini_diablo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_reventon),context.getString(R.string.lamborghini_reventon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_gallardo),context.getString(R.string.lamborghini_gallardo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_countach),context.getString(R.string.lamborghini_countach_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_murcielago),context.getString(R.string.lamborghini_murcielago_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_huracan),context.getString(R.string.lamborghini_huracan_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_350gt),context.getString(R.string.lamborghini_350gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lamborghini_other),context.getString(R.string.lamborghini_other_s)));
        }
        if (carMake.equals(context.getString(R.string.land_rover)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_lr4),context.getString(R.string.land_rover_lr4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_discovery),context.getString(R.string.land_rover_discovery_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_discovery_sport),context.getString(R.string.land_rover_discovery_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_defender),context.getString(R.string.land_rover_defender_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_hse),context.getString(R.string.land_rover_range_rover_hse_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_evoque),context.getString(R.string.land_rover_range_rover_evoque_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_sport),context.getString(R.string.land_rover_range_rover_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_vogue),context.getString(R.string.land_rover_range_rover_vogue_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover_velar),context.getString(R.string.land_rover_range_rover_velar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_range_rover),context.getString(R.string.land_rover_range_rover_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_freelander),context.getString(R.string.land_rover_freelander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.land_rover_other),context.getString(R.string.land_rover_other_s)));
        }
        if (carMake.equals(context.getString(R.string.lexus)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_e_s),context.getString(R.string.lexus_e_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_es),context.getString(R.string.lexus_es_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_es_250),context.getString(R.string.lexus_es_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_es_300),context.getString(R.string.lexus_es_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_es_330),context.getString(R.string.lexus_es_330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_es_350),context.getString(R.string.lexus_es_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_g_s),context.getString(R.string.lexus_g_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gs_250),context.getString(R.string.lexus_gs_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gs_300),context.getString(R.string.lexus_gs_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gs_350),context.getString(R.string.lexus_gs_350_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gs_400),context.getString(R.string.lexus_gs_400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gs_430),context.getString(R.string.lexus_gs_430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gs_460),context.getString(R.string.lexus_gs_460_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gx),context.getString(R.string.lexus_gx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gx_460),context.getString(R.string.lexus_gx_460_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_gx_470),context.getString(R.string.lexus_gx_470_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_is),context.getString(R.string.lexus_is_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_is_200),context.getString(R.string.lexus_is_200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_is_250),context.getString(R.string.lexus_is_250_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_is_300),context.getString(R.string.lexus_is_300_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_is_350),context.getString(R.string.lexus_is_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_ls),context.getString(R.string.lexus_ls_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_ls_400),context.getString(R.string.lexus_ls_400_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_ls_430),context.getString(R.string.lexus_ls_430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_ls_460),context.getString(R.string.lexus_ls_460_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_ls_600),context.getString(R.string.lexus_ls_600_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_lx),context.getString(R.string.lexus_lx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_LX_450),context.getString(R.string.lexus_LX_450_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_LX_470),context.getString(R.string.lexus_LX_470_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_LX_570),context.getString(R.string.lexus_LX_570_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_nx),context.getString(R.string.lexus_nx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_nx_200t),context.getString(R.string.lexus_nx_200t_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_nx_300),context.getString(R.string.lexus_nx_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_rc),context.getString(R.string.lexus_rc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_rc_350),context.getString(R.string.lexus_rc_350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_rc_f),context.getString(R.string.lexus_rc_f_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_rx),context.getString(R.string.lexus_rx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_rx_300),context.getString(R.string.lexus_rx_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_rx_330),context.getString(R.string.lexus_rx_330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_rx_350),context.getString(R.string.lexus_rx_350_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_xr_450),context.getString(R.string.lexus_xr_450_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_sc),context.getString(R.string.lexus_sc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_sc_300),context.getString(R.string.lexus_sc_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_sc_430),context.getString(R.string.lexus_sc_430_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_ct),context.getString(R.string.lexus_ct_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_hs),context.getString(R.string.lexus_hs_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_isf),context.getString(R.string.lexus_isf_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_lfa),context.getString(R.string.lexus_lfa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_ux),context.getString(R.string.lexus_ux_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lexus_other),context.getString(R.string.lexus_other_s)));
        }
        if (carMake.equals(context.getString(R.string.lotus)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_esprit),context.getString(R.string.lotus_esprit_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_elite),context.getString(R.string.lotus_elite_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_elise),context.getString(R.string.lotus_elise_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_eclat),context.getString(R.string.lotus_eclat_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_evora),context.getString(R.string.lotus_evora_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_excel),context.getString(R.string.lotus_excel_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_exige),context.getString(R.string.lotus_exige_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_elan),context.getString(R.string.lotus_elan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_yoruba),context.getString(R.string.lotus_yoruba_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lotus_other),context.getString(R.string.lotus_other_s)));
        }
        if (carMake.equals(context.getString(R.string.lincoln)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_mkx),context.getString(R.string.lincoln_mkx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_mkz),context.getString(R.string.lincoln_mkz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_mark_lt),context.getString(R.string.lincoln_mark_lt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_aviator),context.getString(R.string.lincoln_aviator_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_blackwood),context.getString(R.string.lincoln_blackwood_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_town_car),context.getString(R.string.lincoln_town_car_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_zephyr),context.getString(R.string.lincoln_zephyr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_continental),context.getString(R.string.lincoln_continental_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_mark),context.getString(R.string.lincoln_mark_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_navigator),context.getString(R.string.lincoln_navigator_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_capri),context.getString(R.string.lincoln_capri_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_mks),context.getString(R.string.lincoln_mks_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lincoln_other),context.getString(R.string.lincoln_other_s)));
        }
        if (carMake.equals(context.getString(R.string.mazda)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_2),context.getString(R.string.mazda_2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_3),context.getString(R.string.mazda_3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_5),context.getString(R.string.mazda_5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_121),context.getString(R.string.mazda_121_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_323),context.getString(R.string.mazda_323_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_818),context.getString(R.string.mazda_818_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_929),context.getString(R.string.mazda_929_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_1000),context.getString(R.string.mazda_1000_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_1300),context.getString(R.string.mazda_1300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_3_mps),context.getString(R.string.mazda_3_mps_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_6_mps),context.getString(R.string.mazda_6_mps_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_bt_50),context.getString(R.string.mazda_bt_50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_cx_5),context.getString(R.string.mazda_cx_5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_cx_7),context.getString(R.string.mazda_cx_7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_cx_9),context.getString(R.string.mazda_cx_9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_mpv),context.getString(R.string.mazda_mpv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_mx_3),context.getString(R.string.mazda_mx_3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_mx_5),context.getString(R.string.mazda_mx_5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_rx7),context.getString(R.string.mazda_rx7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_rx8),context.getString(R.string.mazda_rx8_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_6),context.getString(R.string.mazda_6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_efini),context.getString(R.string.mazda_efini_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_proceed),context.getString(R.string.mazda_proceed_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_premacy),context.getString(R.string.mazda_premacy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_bongo),context.getString(R.string.mazda_bongo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_binte),context.getString(R.string.mazda_binte_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_pickup),context.getString(R.string.mazda_pickup_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_tribute),context.getString(R.string.mazda_tribute_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_demio),context.getString(R.string.mazda_demio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_rustler),context.getString(R.string.mazda_rustler_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_spiano),context.getString(R.string.mazda_spiano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_scrumm),context.getString(R.string.mazda_scrumm_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_zedos_6),context.getString(R.string.mazda_zedos_6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_zedos_9),context.getString(R.string.mazda_zedos_9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_sentia),context.getString(R.string.mazda_sentia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_fmilia),context.getString(R.string.mazda_fmilia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_vantrend),context.getString(R.string.mazda_vantrend_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_capella),context.getString(R.string.mazda_capella_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_carol),context.getString(R.string.mazda_carol_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_cliff),context.getString(R.string.mazda_cliff_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_laputa),context.getString(R.string.mazda_laputa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_lantis),context.getString(R.string.mazda_lantis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_levante),context.getString(R.string.mazda_levante_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_luce),context.getString(R.string.mazda_luce_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_cx_30),context.getString(R.string.mazda_cx_30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_Tttan),context.getString(R.string.mazda_Tttan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mazda_other),context.getString(R.string.mazda_other_s)));
        }
        if (carMake.equals(context.getString(R.string.maserati)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_228),context.getString(R.string.maserati_228_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_gt3200),context.getString(R.string.maserati_gt3200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_mc12),context.getString(R.string.maserati_mc12_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_indy),context.getString(R.string.maserati_indy_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_barchetta_stradale),context.getString(R.string.maserati_barchetta_stradale_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_bora),context.getString(R.string.maserati_bora_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_biturbo),context.getString(R.string.maserati_biturbo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_chubasco),context.getString(R.string.maserati_chubasco_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_ghibli),context.getString(R.string.maserati_ghibli_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_khamsin),context.getString(R.string.maserati_khamsin_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_royale),context.getString(R.string.maserati_royale_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_spyder),context.getString(R.string.maserati_spyder_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_shamal),context.getString(R.string.maserati_shamal_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_granTurismo),context.getString(R.string.maserati_granTurismo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_granSport),context.getString(R.string.maserati_granSport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_granCabrio),context.getString(R.string.maserati_granCabrio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_karif),context.getString(R.string.maserati_karif_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_quattroporte),context.getString(R.string.maserati_quattroporte_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_coupe),context.getString(R.string.maserati_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_kyalami),context.getString(R.string.maserati_kyalami_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_maxico),context.getString(R.string.maserati_maxico_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_merak),context.getString(R.string.maserati_merak_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maserati_other),context.getString(R.string.maserati_other_s)));
        }
        if (carMake.equals(context.getString(R.string.morgan)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.morgan_plus4),context.getString(R.string.morgan_plus4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.morgan_plus8),context.getString(R.string.morgan_plus8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.morgan_v6),context.getString(R.string.morgan_v6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.morgan_aero),context.getString(R.string.morgan_aero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.morgan_aero_8),context.getString(R.string.morgan_aero_8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.morgan_roadster),context.getString(R.string.morgan_roadster_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.morgan_other),context.getString(R.string.morgan_other_s)));
        }
        if (carMake.equals(context.getString(R.string.mitsubishi)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_asx),context.getString(R.string.mitsubishi_asx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_fto),context.getString(R.string.mitsubishi_fto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_3000gt),context.getString(R.string.mitsubishi_3000gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_gto),context.getString(R.string.mitsubishi_gto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_l200),context.getString(R.string.mitsubishi_l200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_rvr),context.getString(R.string.mitsubishi_rvr_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_outlander),context.getString(R.string.mitsubishi_outlander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_aspire),context.getString(R.string.mitsubishi_aspire_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_eclipse),context.getString(R.string.mitsubishi_eclipse_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_endeavour),context.getString(R.string.mitsubishi_endeavour_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_i_miev),context.getString(R.string.mitsubishi_i_miev_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_evolution),context.getString(R.string.mitsubishi_evolution_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_eK_wagon),context.getString(R.string.mitsubishi_eK_wagon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_emeraude),context.getString(R.string.mitsubishi_emeraude_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_pajero),context.getString(R.string.mitsubishi_pajero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_pajero_sport),context.getString(R.string.mitsubishi_pajero_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_proudia),context.getString(R.string.mitsubishi_proudia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_pistachio),context.getString(R.string.mitsubishi_pistachio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_town_box),context.getString(R.string.mitsubishi_town_box_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_tredia),context.getString(R.string.mitsubishi_tredia_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_chariot),context.getString(R.string.mitsubishi_chariot_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_galant),context.getString(R.string.mitsubishi_galant_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_grandis),context.getString(R.string.mitsubishi_grandis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_jeep),context.getString(R.string.mitsubishi_jeep_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_debonair),context.getString(R.string.mitsubishi_debonair_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_delica),context.getString(R.string.mitsubishi_delica_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_dingo),context.getString(R.string.mitsubishi_dingo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_dion),context.getString(R.string.mitsubishi_dion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_raider),context.getString(R.string.mitsubishi_raider_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_sapporo),context.getString(R.string.mitsubishi_sapporo_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_space_runner),context.getString(R.string.mitsubishi_space_runner_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_space_star),context.getString(R.string.mitsubishi_space_star_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_space_wagon),context.getString(R.string.mitsubishi_space_wagon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_celeste),context.getString(R.string.mitsubishi_celeste_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_fuso_canter),context.getString(R.string.mitsubishi_fuso_canter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_fuso_rosa),context.getString(R.string.mitsubishi_fuso_rosa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_carisma),context.getString(R.string.mitsubishi_carisma_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_canter),context.getString(R.string.mitsubishi_canter_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_cordia),context.getString(R.string.mitsubishi_cordia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_colt),context.getString(R.string.mitsubishi_colt_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_lancer),context.getString(R.string.mitsubishi_lancer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_legnum),context.getString(R.string.mitsubishi_legnum_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_magna),context.getString(R.string.mitsubishi_magna_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_montero),context.getString(R.string.mitsubishi_montero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_mirage),context.getString(R.string.mitsubishi_mirage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_monica),context.getString(R.string.mitsubishi_monica_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_native),context.getString(R.string.mitsubishi_native_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_attrage),context.getString(R.string.mitsubishi_attrage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_fuso),context.getString(R.string.mitsubishi_fuso_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_pajero_io),context.getString(R.string.mitsubishi_pajero_io_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_pajero_mini),context.getString(R.string.mitsubishi_pajero_mini_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_rosa),context.getString(R.string.mitsubishi_rosa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mitsubishi_other),context.getString(R.string.mitsubishi_other_s)));
        }
        if (carMake.equals(context.getString(R.string.mercury)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_tracer),context.getString(R.string.mercury_tracer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_topaz),context.getString(R.string.mercury_topaz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_grand_marquis),context.getString(R.string.mercury_grand_marquis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_sable),context.getString(R.string.mercury_sable_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_villager),context.getString(R.string.mercury_villager_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_capri),context.getString(R.string.mercury_capri_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_cougar),context.getString(R.string.mercury_cougar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_marauder),context.getString(R.string.mercury_marauder_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_marquis),context.getString(R.string.mercury_marquis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_mariner),context.getString(R.string.mercury_mariner_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_mountaineer),context.getString(R.string.mercury_mountaineer_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_montego),context.getString(R.string.mercury_montego_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_mystique),context.getString(R.string.mercury_mystique_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_milan),context.getString(R.string.mercury_milan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mercury_other),context.getString(R.string.mercury_other_s)));
        }
        if (carMake.equals(context.getString(R.string.mini)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_one),context.getString(R.string.mini_one_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_clubman),context.getString(R.string.mini_clubman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper),context.getString(R.string.mini_cooper_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_countryman),context.getString(R.string.mini_countryman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_cabrio),context.getString(R.string.mini_cooper_cabrio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_paceman),context.getString(R.string.mini_cooper_paceman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_s),context.getString(R.string.mini_cooper_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_s_cabrio),context.getString(R.string.mini_cooper_s_cabrio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_s_clubman),context.getString(R.string.mini_cooper_s_clubman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_s_countryman),context.getString(R.string.mini_cooper_s_countryman_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_s_Coupé),context.getString(R.string.mini_cooper_s_Coupé_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_cooper_s_paceman),context.getString(R.string.mini_cooper_s_paceman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_John_cooper_works),context.getString(R.string.mini_John_cooper_works_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_John_cooper_works_countryman),context.getString(R.string.mini_John_cooper_works_countryman_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_john_cooper_works_coupé),context.getString(R.string.mini_john_cooper_works_coupé_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mini_other),context.getString(R.string.mini_other_s)));
        }
        if (carMake.equals(context.getString(R.string.nissan)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_100nx),context.getString(R.string.nissan_100nx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_180sx),context.getString(R.string.nissan_180sx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_200sx),context.getString(R.string.nissan_200sx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_240sx),context.getString(R.string.nissan_240sx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_280zx),context.getString(R.string.nissan_280zx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_300xz),context.getString(R.string.nissan_300xz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_350z),context.getString(R.string.nissan_350z_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_370z),context.getString(R.string.nissan_370z_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_ad),context.getString(R.string.nissan_ad_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_gt_r),context.getString(R.string.nissan_gt_r_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_np_300),context.getString(R.string.nissan_np_300_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_nx_coupe),context.getString(R.string.nissan_nx_coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_x_trail),context.getString(R.string.nissan_x_trail_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_elgrand),context.getString(R.string.nissan_elgrand_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_armada),context.getString(R.string.nissan_armada_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_avenir),context.getString(R.string.nissan_avenir_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_xterra),context.getString(R.string.nissan_xterra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_altima),context.getString(R.string.nissan_altima_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_almera),context.getString(R.string.nissan_almera_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_otti),context.getString(R.string.nissan_otti_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_patrol),context.getString(R.string.nissan_patrol_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_pathfinder),context.getString(R.string.nissan_pathfinder_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_bassara),context.getString(R.string.nissan_bassara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_prairie),context.getString(R.string.nissan_prairie_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_presage),context.getString(R.string.nissan_presage_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_presea),context.getString(R.string.nissan_presea_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_president),context.getString(R.string.nissan_president_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_bluebird),context.getString(R.string.nissan_bluebird_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_pulsar),context.getString(R.string.nissan_pulsar_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_pickup),context.getString(R.string.nissan_pickup_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_titan),context.getString(R.string.nissan_titan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_cherry),context.getString(R.string.nissan_cherry_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_tiida),context.getString(R.string.nissan_tiida_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_terrano),context.getString(R.string.nissan_terrano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_gloria),context.getString(R.string.nissan_gloria_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_juke),context.getString(R.string.nissan_juke_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_junior),context.getString(R.string.nissan_junior_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_datsun),context.getString(R.string.nissan_datsun_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_rasheen),context.getString(R.string.nissan_rasheen_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_rogue),context.getString(R.string.nissan_rogue_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_stagea),context.getString(R.string.nissan_stagea_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_stanza),context.getString(R.string.nissan_stanza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_skyline),context.getString(R.string.nissan_skyline_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_sentra),context.getString(R.string.nissan_sentra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_cadric),context.getString(R.string.nissan_cadric_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_serena),context.getString(R.string.nissan_serena_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_cefiro),context.getString(R.string.nissan_cefiro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_silvia),context.getString(R.string.nissan_silvia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_cima),context.getString(R.string.nissan_cima_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_sunny),context.getString(R.string.nissan_sunny_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_van),context.getString(R.string.nissan_van_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_vanette),context.getString(R.string.nissan_vanette_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_fairlady),context.getString(R.string.nissan_fairlady_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_frontier),context.getString(R.string.nissan_frontier_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_fuga),context.getString(R.string.nissan_fuga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_versa),context.getString(R.string.nissan_versa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_figaro),context.getString(R.string.nissan_figaro_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_qashqai),context.getString(R.string.nissan_qashqai_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_crew),context.getString(R.string.nissan_crew_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_quest),context.getString(R.string.nissan_quest_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_kicks),context.getString(R.string.nissan_kicks_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_cube),context.getString(R.string.nissan_cube_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_largo),context.getString(R.string.nissan_largo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_lafesta),context.getString(R.string.nissan_lafesta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_laurel),context.getString(R.string.nissan_laurel_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_lucino),context.getString(R.string.nissan_lucino_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_lberty),context.getString(R.string.nissan_lberty_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_leaf),context.getString(R.string.nissan_leaf_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_livina),context.getString(R.string.nissan_livina_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_leopard),context.getString(R.string.nissan_leopard_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_maxima),context.getString(R.string.nissan_maxima_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_murano),context.getString(R.string.nissan_murano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_moco),context.getString(R.string.nissan_moco_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_mistral),context.getString(R.string.nissan_mistral_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_micra),context.getString(R.string.nissan_micra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_navara),context.getString(R.string.nissan_navara_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_n90),context.getString(R.string.nissan_n90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_wingroad),context.getString(R.string.nissan_wingroad_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_almera_tino),context.getString(R.string.nissan_almera_tino_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_caravan),context.getString(R.string.nissan_caravan_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_condor),context.getString(R.string.nissan_condor_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_dualis),context.getString(R.string.nissan_dualis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_dualis_2),context.getString(R.string.nissan_dualis_2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_note),context.getString(R.string.nissan_note_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_nv350),context.getString(R.string.nissan_nv350_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_patrol_pickup),context.getString(R.string.nissan_patrol_pickup_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_patrol_safari),context.getString(R.string.nissan_patrol_safari_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_teana),context.getString(R.string.nissan_teana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_united_diesel),context.getString(R.string.nissan_united_diesel_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_urvan),context.getString(R.string.nissan_urvan_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.nissan_other),context.getString(R.string.nissan_other_s)));
        }
        if (carMake.equals(context.getString(R.string.hummer)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.hummer_h1),context.getString(R.string.hummer_h1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hummer_h2),context.getString(R.string.hummer_h2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hummer_h3),context.getString(R.string.hummer_h3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hummer_other),context.getString(R.string.hummer_other_s)));
        }
        if (carMake.equals(context.getString(R.string.honda)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_cr_v),context.getString(R.string.honda_cr_v_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_vr_z),context.getString(R.string.honda_vr_z_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_hr_v),context.getString(R.string.honda_hr_v_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_mdx),context.getString(R.string.honda_mdx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_mr_v),context.getString(R.string.honda_mr_v_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_nsx),context.getString(R.string.honda_nsx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_s2000),context.getString(R.string.honda_s2000_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_smx),context.getString(R.string.honda_smx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_srx),context.getString(R.string.honda_srx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_that_s),context.getString(R.string.honda_that_s_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.honda_z),context.getString(R.string.honda_z_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_accord),context.getString(R.string.honda_accord_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_odyssey),context.getString(R.string.honda_odyssey_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_insight),context.getString(R.string.honda_insight_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_inspire),context.getString(R.string.honda_inspire_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_fcx_clarity),context.getString(R.string.honda_fcx_clarity_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_avencier),context.getString(R.string.honda_avencier_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_element),context.getString(R.string.honda_element_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_integra),context.getString(R.string.honda_integra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_orthia),context.getString(R.string.honda_orthia_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.honda_edix),context.getString(R.string.honda_edix_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_airwave),context.getString(R.string.honda_airwave_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_elysion),context.getString(R.string.honda_elysion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_partner),context.getString(R.string.honda_partner_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_passport),context.getString(R.string.honda_passport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_pilot),context.getString(R.string.honda_pilot_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_prelude),context.getString(R.string.honda_prelude_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_beat),context.getString(R.string.honda_beat_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_today),context.getString(R.string.honda_today_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_domani),context.getString(R.string.honda_domani_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.honda_rafaga),context.getString(R.string.honda_rafaga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_ridgeline),context.getString(R.string.honda_ridgeline_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_step_wgn),context.getString(R.string.honda_step_wgn_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_stream),context.getString(R.string.honda_stream_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_city),context.getString(R.string.honda_city_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_civic),context.getString(R.string.honda_civic_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_shuttle),context.getString(R.string.honda_shuttle_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_vamos),context.getString(R.string.honda_vamos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_vigor),context.getString(R.string.honda_vigor_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_jazz),context.getString(R.string.honda_jazz_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.honda_fit_aria),context.getString(R.string.honda_fit_aria_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_capa),context.getString(R.string.honda_capa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_crossroad),context.getString(R.string.honda_crossroad_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_concerto),context.getString(R.string.honda_concerto_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_quintet),context.getString(R.string.honda_quintet_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_laGreat),context.getString(R.string.honda_laGreat_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_life),context.getString(R.string.honda_life_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_logo),context.getString(R.string.honda_logo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_legend),context.getString(R.string.honda_legend_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_mobilio),context.getString(R.string.honda_mobilio_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.honda_accord_Coupe),context.getString(R.string.honda_accord_Coupe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.honda_other),context.getString(R.string.honda_other_s)));
        }
        if (carMake.equals(context.getString(R.string.geely)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_ck),context.getString(R.string.geely_ck_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_gc2),context.getString(R.string.geely_gc2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_gc5),context.getString(R.string.geely_gc5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_gc6),context.getString(R.string.geely_gc6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_gc7),context.getString(R.string.geely_gc7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_gx2),context.getString(R.string.geely_gx2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_hq),context.getString(R.string.geely_hq_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_lc),context.getString(R.string.geely_lc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_mk_cross),context.getString(R.string.geely_mk_cross_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_sc7),context.getString(R.string.geely_sc7_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.geely_emgrand_7),context.getString(R.string.geely_emgrand_7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_emgrand_8),context.getString(R.string.geely_emgrand_8_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_emgrand_x7),context.getString(R.string.geely_emgrand_x7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_emgrand_gt),context.getString(R.string.geely_emgrand_gt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.geely_other),context.getString(R.string.geely_other_s)));
        }
        if (carMake.equals(context.getString(R.string.zxauto)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.zxauto_admiral),context.getString(R.string.zxauto_admiral_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.zxauto_grand_tiger),context.getString(R.string.zxauto_grand_tiger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.zxauto_other),context.getString(R.string.zxauto_other_s)));
        }
        if (carMake.equals(context.getString(R.string.mg)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_mg3),context.getString(R.string.mg_mg3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_mg5),context.getString(R.string.mg_mg5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_mg6),context.getString(R.string.mg_mg6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_350s),context.getString(R.string.mg_350s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_550),context.getString(R.string.mg_550_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_mga),context.getString(R.string.mg_mga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_mgc),context.getString(R.string.mg_mgc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_midget),context.getString(R.string.mg_midget_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mg_other),context.getString(R.string.mg_other_s)));
        }
        if (carMake.equals(context.getString(R.string.proton)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.proton_gen_2),context.getString(R.string.proton_gen_2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.proton_persona),context.getString(R.string.proton_persona_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.proton_waja),context.getString(R.string.proton_waja_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.proton_other),context.getString(R.string.proton_other_s)));
        }
        if (carMake.equals(context.getString(R.string.brilliance)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_h220),context.getString(R.string.brilliance_h220_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_h230),context.getString(R.string.brilliance_h230_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_h320),context.getString(R.string.brilliance_h320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_h330),context.getString(R.string.brilliance_h330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_h530),context.getString(R.string.brilliance_h530_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_m1),context.getString(R.string.brilliance_m1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_v5),context.getString(R.string.brilliance_v5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.brilliance_other),context.getString(R.string.brilliance_other_s)));
        }
        if (carMake.equals(context.getString(R.string.byd)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_f0),context.getString(R.string.bdy_f0_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_f3r),context.getString(R.string.bdy_f3r_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_f5),context.getString(R.string.bdy_f5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_f6),context.getString(R.string.bdy_f6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_f7),context.getString(R.string.bdy_f7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_g3),context.getString(R.string.bdy_g3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_s6),context.getString(R.string.bdy_s6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_e6),context.getString(R.string.bdy_e6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bdy_other),context.getString(R.string.bdy_other_s)));
        }
        if (carMake.equals(context.getString(R.string.samsung)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.samsung_qm5),context.getString(R.string.samsung_qm5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.samsung_qm3),context.getString(R.string.samsung_qm3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.samsung_sm_3),context.getString(R.string.samsung_sm_3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.samsung_sm_5),context.getString(R.string.samsung_sm_5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.samsung_sm_6),context.getString(R.string.samsung_sm_6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.samsung_sm_7),context.getString(R.string.samsung_sm_7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.samsung_other),context.getString(R.string.samsung_other_s)));
        }
        if (carMake.equals(context.getString(R.string.tesla)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.tesla_3),context.getString(R.string.tesla_3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tesla_S),context.getString(R.string.tesla_S_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tesla_X),context.getString(R.string.tesla_X_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tesla_Other),context.getString(R.string.tesla_Other_s)));
        }
        if (carMake.equals(context.getString(R.string.iran_khodro)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.iran_khodro_samand),context.getString(R.string.iran_khodro_samand_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.iran_khodro_tiba),context.getString(R.string.iran_khodro_tiba_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.iran_khodro_other),context.getString(R.string.iran_khodro_other_s)));
        }
        if (carMake.equals(context.getString(R.string.tata)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_aria),context.getString(R.string.tata_aria_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_indigo),context.getString(R.string.tata_indigo_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_indica),context.getString(R.string.tata_indica_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_bolt),context.getString(R.string.tata_bolt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_telcoline),context.getString(R.string.tata_telcoline_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_tiago),context.getString(R.string.tata_tiago_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_genX_nano),context.getString(R.string.tata_genX_nano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_xenon),context.getString(R.string.tata_xenon_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_safari),context.getString(R.string.tata_safari_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_sumo),context.getString(R.string.tata_sumo_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.tata_nano),context.getString(R.string.tata_nano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_613),context.getString(R.string.tata_613_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.tata_other),context.getString(R.string.tata_other_s)));
        }
        if (carMake.equals(context.getString(R.string.bugatti)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.bugatti_eb_110),context.getString(R.string.bugatti_eb_110_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bugatti_chiron),context.getString(R.string.bugatti_chiron_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bugatti_grand_sport),context.getString(R.string.bugatti_grand_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bugatti_super_sport),context.getString(R.string.bugatti_super_sport_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bugatti_veyron),context.getString(R.string.bugatti_veyron_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.bugatti_other),context.getString(R.string.bugatti_other_s)));
        }
        if (carMake.equals(context.getString(R.string.acura)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_cl),context.getString(R.string.acura_cl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_ilx),context.getString(R.string.acura_ilx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_mdx),context.getString(R.string.acura_mdx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_nsx),context.getString(R.string.acura_nsx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_rdx),context.getString(R.string.acura_rdx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_rl),context.getString(R.string.acura_rl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_rlx),context.getString(R.string.acura_rlx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_rsx),context.getString(R.string.acura_rsx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_tl),context.getString(R.string.acura_tl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_tlx),context.getString(R.string.acura_tlx_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.acura_tsx),context.getString(R.string.acura_tsx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_zdx),context.getString(R.string.acura_zdx_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_integra),context.getString(R.string.acura_integra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_legend),context.getString(R.string.acura_legend_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.acura_other),context.getString(R.string.acura_other_s)));
        }
        if (carMake.equals(context.getString(R.string.scion)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_fr_s),context.getString(R.string.scion_fr_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_ia),context.getString(R.string.scion_ia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_im),context.getString(R.string.scion_im_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_tc),context.getString(R.string.scion_tc_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_xa),context.getString(R.string.scion_xa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_xb),context.getString(R.string.scion_xb_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_xd),context.getString(R.string.scion_xd_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_fuse),context.getString(R.string.scion_fuse_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.scion_other),context.getString(R.string.scion_other_s)));
        }
        if (carMake.equals(context.getString(R.string.mclaren)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.mclaren_540),context.getString(R.string.mclaren_540_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mclaren_570),context.getString(R.string.mclaren_570_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mclaren_650),context.getString(R.string.mclaren_650_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mclaren_675),context.getString(R.string.mclaren_675_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mclaren_12c),context.getString(R.string.mclaren_12c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mclaren_p1),context.getString(R.string.mclaren_p1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.mclaren_other),context.getString(R.string.mclaren_other_s)));
        }
        if (carMake.equals(context.getString(R.string.pagani)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.pagani_zonda),context.getString(R.string.pagani_zonda_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pagani_huayra),context.getString(R.string.pagani_huayra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.pagani_other),context.getString(R.string.pagani_other_s)));
        }
        if (carMake.equals(context.getString(R.string.lancia)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_thesis),context.getString(R.string.lancia_thesis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_thema),context.getString(R.string.lancia_thema_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_delta),context.getString(R.string.lancia_delta_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_dedra),context.getString(R.string.lancia_dedra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_flavia),context.getString(R.string.lancia_flavia_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_voyager),context.getString(R.string.lancia_voyager_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_kappa),context.getString(R.string.lancia_kappa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_lybra),context.getString(R.string.lancia_lybra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_musa),context.getString(R.string.lancia_musa_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_ypsilon),context.getString(R.string.lancia_ypsilon_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_stratos),context.getString(R.string.lancia_stratos_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lancia_other),context.getString(R.string.lancia_other_s)));
        }
        if (carMake.equals(context.getString(R.string.jac)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_iev_5),context.getString(R.string.jac_iev_5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_iev_6),context.getString(R.string.jac_iev_6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_s1),context.getString(R.string.jac_s1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_s2),context.getString(R.string.jac_s2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_s3),context.getString(R.string.jac_s3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_s5),context.getString(R.string.jac_s5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_s7),context.getString(R.string.jac_s7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_spv),context.getString(R.string.jac_spv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_x200),context.getString(R.string.jac_x200_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_m3),context.getString(R.string.jac_m3_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.jac_m4),context.getString(R.string.jac_m4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_m5),context.getString(R.string.jac_m5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_a60),context.getString(R.string.jac_a60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_t6_frison),context.getString(R.string.jac_t6_frison_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_j4),context.getString(R.string.jac_j4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_n_series),context.getString(R.string.jac_n_series_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.jac_v1),context.getString(R.string.jac_v1_s)));
        }
        if (carMake.equals(context.getString(R.string.lifan)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_1022),context.getString(R.string.lifan_1022_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_1025),context.getString(R.string.lifan_1025_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_320e),context.getString(R.string.lifan_320e_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_330),context.getString(R.string.lifan_330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_330ev),context.getString(R.string.lifan_330ev_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_620ii),context.getString(R.string.lifan_620ii_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_650ev),context.getString(R.string.lifan_650ev_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_820),context.getString(R.string.lifan_820_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_c3),context.getString(R.string.lifan_c3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_c30E),context.getString(R.string.lifan_c30E_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_foison),context.getString(R.string.lifan_foison_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_l7),context.getString(R.string.lifan_l7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_m7),context.getString(R.string.lifan_m7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_seasion),context.getString(R.string.lifan_seasion_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_x50),context.getString(R.string.lifan_x50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_x60),context.getString(R.string.lifan_x60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_x7),context.getString(R.string.lifan_x7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_x70),context.getString(R.string.lifan_x70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.lifan_x80),context.getString(R.string.lifan_x80_s)));
        }
        if (carMake.equals(context.getString(R.string.faw)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_b30),context.getString(R.string.faw_b30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_b50),context.getString(R.string.faw_b50_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_b70),context.getString(R.string.faw_b70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_j5k_165),context.getString(R.string.faw_j5k_165_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_j5m),context.getString(R.string.faw_j5m_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_j5m_220),context.getString(R.string.faw_j5m_220_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_j5m_280),context.getString(R.string.faw_j5m_280_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_j5P_330),context.getString(R.string.faw_j5P_330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_j5P_420),context.getString(R.string.faw_j5P_420_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_v2),context.getString(R.string.faw_v2_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.faw_x40),context.getString(R.string.faw_x40_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_x80),context.getString(R.string.faw_x80_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_xPV),context.getString(R.string.faw_xPV_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_actis_v80_v80L),context.getString(R.string.faw_actis_v80_v80L_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_tiger_v),context.getString(R.string.faw_tiger_v_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_carrier),context.getString(R.string.faw_carrier_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_mini_truck_t80),context.getString(R.string.faw_mini_truck_t80_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.faw_hongqi_h7),context.getString(R.string.faw_hongqi_h7_s)));
        }
        if (carMake.equals(context.getString(R.string.foton)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_toana),context.getString(R.string.foton_toana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_toplander),context.getString(R.string.foton_toplander_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_tornado),context.getString(R.string.foton_tornado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_thunder),context.getString(R.string.foton_thunder_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_gratour),context.getString(R.string.foton_gratour_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_view_traveller),context.getString(R.string.foton_view_traveller_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_view_transvan),context.getString(R.string.foton_view_transvan_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_sauvana),context.getString(R.string.foton_sauvana_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_tunland),context.getString(R.string.foton_tunland_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_view_c1),context.getString(R.string.foton_view_c1_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.foton_view_c2),context.getString(R.string.foton_view_c2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_view_cs2),context.getString(R.string.foton_view_cs2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_aumark_s),context.getString(R.string.foton_aumark_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_aumark_c),context.getString(R.string.foton_aumark_c_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.foton_aumark_tx),context.getString(R.string.foton_aumark_tx_s)));
        }
        if (carMake.equals(context.getString(R.string.maruti_suzuki)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_eeco),context.getString(R.string.maruti_Suzuki_eeco_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_ignis),context.getString(R.string.maruti_Suzuki_ignis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_ertiga),context.getString(R.string.maruti_Suzuki_ertiga_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_s_cross),context.getString(R.string.maruti_Suzuki_s_cross_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_alto_800),context.getString(R.string.maruti_Suzuki_alto_800_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_alto_k10),context.getString(R.string.maruti_Suzuki_alto_k10_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_omni),context.getString(R.string.maruti_Suzuki_omni_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_baleno),context.getString(R.string.maruti_Suzuki_baleno_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_baleno_car_s),context.getString(R.string.maruti_Suzuki_baleno_car_s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_gypsy),context.getString(R.string.maruti_Suzuki_gypsy_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_jimny),context.getString(R.string.maruti_Suzuki_jimny_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_dzire),context.getString(R.string.maruti_Suzuki_dzire_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_swift),context.getString(R.string.maruti_Suzuki_swift_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_ciaz),context.getString(R.string.maruti_Suzuki_ciaz_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_ciaz_car_s),context.getString(R.string.maruti_Suzuki_ciaz_s_car_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_celerio),context.getString(R.string.maruti_Suzuki_celerio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_celerio_x),context.getString(R.string.maruti_Suzuki_celerio_x_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_vitara_brezza),context.getString(R.string.maruti_Suzuki_vitara_brezza_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.maruti_Suzuki_wagon_r),context.getString(R.string.maruti_Suzuki_wagon_r_s)));
        }
        if (carMake.equals(context.getString(R.string.saipa)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_111),context.getString(R.string.saipa_111_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_131),context.getString(R.string.saipa_131_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_132),context.getString(R.string.saipa_132_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_141),context.getString(R.string.saipa_141_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_cs35),context.getString(R.string.saipa_cs35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_d_375),context.getString(R.string.saipa_d_375_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_fh500),context.getString(R.string.saipa_fh500_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_fm460),context.getString(R.string.saipa_fm460_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_h220),context.getString(R.string.saipa_h220_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_h230),context.getString(R.string.saipa_h230_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_h320),context.getString(R.string.saipa_h320_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_h330),context.getString(R.string.saipa_h330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_r270),context.getString(R.string.saipa_r270_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_ario),context.getString(R.string.saipa_ario_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_azar_van),context.getString(R.string.saipa_azar_van_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_eado),context.getString(R.string.saipa_eado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_padra),context.getString(R.string.saipa_padra_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_tondar_90),context.getString(R.string.saipa_tondar_90_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_tiba),context.getString(R.string.saipa_tiba_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_roniz),context.getString(R.string.saipa_roniz_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_rich),context.getString(R.string.saipa_rich_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_rio),context.getString(R.string.saipa_rio_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_sandero),context.getString(R.string.saipa_sandero_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_saina),context.getString(R.string.saipa_saina_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_stralis),context.getString(R.string.saipa_stralis_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_cerato),context.getString(R.string.saipa_cerato_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_shooka),context.getString(R.string.saipa_shooka_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_foton),context.getString(R.string.saipa_foton_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_qashqai),context.getString(R.string.saipa_qashqai_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_koleos),context.getString(R.string.saipa_koleos_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_maxima),context.getString(R.string.saipa_maxima_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_new_pickup),context.getString(R.string.saipa_new_pickup_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_new_murano),context.getString(R.string.saipa_new_murano_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_quick),context.getString(R.string.saipa_quick_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.saipa_other),context.getString(R.string.saipa_other_s)));
        }
        if (carMake.equals(context.getString(R.string.private_type)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.private_coupec),context.getString(R.string.private_coupec_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.private_coupec),context.getString(R.string.private_coupec_s)));
        }
        if (carMake.equals(context.getString(R.string.baic)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.baic_grand_tiger),context.getString(R.string.baic_grand_tiger_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.baic_x65),context.getString(R.string.baic_x65_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.baic_bJ40),context.getString(R.string.baic_bJ40_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.baic_a113),context.getString(R.string.baic_a113_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.baic_a115),context.getString(R.string.baic_a115_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.baic_x35),context.getString(R.string.baic_x35_s)));
        }
        if (carMake.equals(context.getString(R.string.changan)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_cx20),context.getString(R.string.changan_cx20_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_cx30),context.getString(R.string.changan_cx30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_sania),context.getString(R.string.changan_sania_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_eado),context.getString(R.string.changan_eado_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_v7),context.getString(R.string.changan_v7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_xt),context.getString(R.string.changan_xt_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_raeton),context.getString(R.string.changan_raeton_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_cs35),context.getString(R.string.changan_cs35_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_cs75),context.getString(R.string.changan_cs75_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_cs85),context.getString(R.string.changan_cs85_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.changan_cs95),context.getString(R.string.changan_cs95_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.changan_benni_mini),context.getString(R.string.changan_benni_mini_s)));
        }
        if (carMake.equals(context.getString(R.string.hunaghai)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.hunaghai_n1),context.getString(R.string.hunaghai_n1_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hunaghai_n1s),context.getString(R.string.hunaghai_n1s_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hunaghai_n2),context.getString(R.string.hunaghai_n2_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hunaghai_n3),context.getString(R.string.hunaghai_n3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hunaghai_dd6591dm),context.getString(R.string.hunaghai_dd6591dm_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hunaghai_dd6534gl),context.getString(R.string.hunaghai_dd6534gl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.hunaghai_dd6600ev),context.getString(R.string.hunaghai_dd6600ev_s)));
        }

        if (carMake.equals(context.getString(R.string.dfm)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_370),context.getString(R.string.dfm_370_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_580),context.getString(R.string.dfm_580_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_a30),context.getString(R.string.dfm_a30_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_a60),context.getString(R.string.dfm_a60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_a9),context.getString(R.string.dfm_a9_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_ax3),context.getString(R.string.dfm_ax3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_ax4),context.getString(R.string.dfm_ax4_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_xa5),context.getString(R.string.dfm_xa5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_xa7),context.getString(R.string.dfm_xa7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_c37),context.getString(R.string.dfm_c37_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_cM7),context.getString(R.string.dfm_cM7_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_e70),context.getString(R.string.dfm_e70_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_f600),context.getString(R.string.dfm_f600_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_glory_330),context.getString(R.string.dfm_glory_330_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_glory_360),context.getString(R.string.dfm_glory_360_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_h30_cross),context.getString(R.string.dfm_h30_cross_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_joyear_lv),context.getString(R.string.dfm_joyear_lv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_joyear_x3),context.getString(R.string.dfm_joyear_x3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_joyear_x5),context.getString(R.string.dfm_joyear_x5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a),context.getString(R.string.audi_a_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_joyear_xl),context.getString(R.string.dfm_joyear_xl_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_joyear_xv),context.getString(R.string.dfm_joyear_xv_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_l60),context.getString(R.string.dfm_l60_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_m3),context.getString(R.string.dfm_m3_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_m5),context.getString(R.string.dfm_m5_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_mx6),context.getString(R.string.dfm_mx6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_rich),context.getString(R.string.dfm_rich_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_succe),context.getString(R.string.dfm_succe_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_sx6),context.getString(R.string.dfm_sx6_s)));
            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_u_vane),context.getString(R.string.dfm_u_vane_s)));

            carModelArrayList.add(new CarModel(context.getString(R.string.dfm_v3),context.getString(R.string.dfm_v3_s)));
        }

            return carModelArrayList;
    }


    public static ArrayList<CarMakeAndCarModel> fillAllCarArrayL(Context context)
    {
        ArrayList<CarMakeAndCarModel> allCarArrayList = new ArrayList<>();

        ArrayList<CarMake> carMakeArrayList  = new ArrayList<CarMake>();
        ArrayList<CarModel> carModelArrayL  = new ArrayList<CarModel>();

        carMakeArrayList = fillCarMakeArrayL(carMakeArrayList,context);

        for (int i =0 ;i<carMakeArrayList.size();i++)
        {
            carModelArrayL  = new ArrayList<CarModel>();
            carModelArrayL = fillCarModelArrayL(carModelArrayL,context,carMakeArrayList.get(i).getMakeStr());
            for (int j =0;j<carModelArrayL.size();j++)
            {
                CarMakeAndCarModel carMakeAndCarModel = new CarMakeAndCarModel
                        (carMakeArrayList.get(i).getMakeStr()
                        ,carMakeArrayList.get(i).getMakeStrS()
                                ,carModelArrayL.get(j).getCarModelStr()
                                ,carModelArrayL.get(j).getCarModelStrS()
                        );
                allCarArrayList.add(carMakeAndCarModel);
            }

        }

        return allCarArrayList;
    }

    public static ArrayList<ItemFilterModel> fillCarmodelFilterArrayL(Context context,String carMake) {
        ArrayList<ItemFilterModel>carModelFilterArrayList = new ArrayList<ItemFilterModel>();

        ArrayList<CarModel>carModelArrayList = new ArrayList<CarModel>();
        carModelArrayList = fillCarModelArrayL(carModelArrayList,context,carMake);

        for (int i = 0;i<carModelArrayList.size();i++)
        {
            ItemFilterModel itemFilterModel = new ItemFilterModel(
                    carModelArrayList.get(i).getCarModelStr()
                    ,carModelArrayList.get(i).getCarModelStrS()
            );
            carModelFilterArrayList.add(itemFilterModel);
        }
        return carModelFilterArrayList;
    }

}
