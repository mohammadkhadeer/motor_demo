package com.cars.halamotor.functions;

import android.content.Context;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarModel;

import java.util.ArrayList;

public class FillCarModel {

    public static ArrayList<CarModel> fillCarMakeArrayL(ArrayList<CarModel> carModelArrayList, Context context, String carMake) {
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

        if (carMake.equals(context.getString(R.string.audi)))
        {
            carModelArrayList.add(new CarModel(context.getString(R.string.audi_a),context.getString(R.string.audi_a_s)));
        }

            return carModelArrayList;
    }

}
