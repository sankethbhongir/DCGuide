package com.example.sanketh.dcguide.Utils;

import android.content.Context;

import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.models.Hotels;
import com.example.sanketh.dcguide.models.Places;
import com.example.sanketh.dcguide.models.Restaurants;

import java.util.ArrayList;
import java.util.List;


public class Utils {

    public List<Places> getPlacesData(Context context){

        List<Places> places = new ArrayList<>();
        places.add(new Places(context.getString(R.string.lincoln_memorial_place1_title), context.getString(R.string.lincoln_memorial_place1_headline),
                context.getString(R.string.lincoln_memorial_place1_sub_headline_1), context.getString(R.string.lincoln_memorial_place1_sub_headline_1_info),
                context.getString(R.string.lincoln_memorial_place1_sub_headline_2), context.getString(R.string.lincoln_memorial_place1_sub_headline_2_info),
                context.getString(R.string.lincoln_memorial_place1_location), R.drawable.lincoln_memorial_place));

        places.add(new Places(context.getString(R.string.martin_luther_place2_title), context.getString(R.string.martin_luther_place2_headline),
                context.getString(R.string.martin_luther_place2_sub_headline_1), context.getString(R.string.martin_luther_place2_sub_headline_1_info),
                context.getString(R.string.martin_luther_place2_sub_headline_2), context.getString(R.string.martin_luther_place2_sub_headline_2_info),
                context.getString(R.string.martin_luther_place2_location), R.drawable.martin_luther_king_jr_memorial_place));

        places.add(new Places(context.getString(R.string.jeff_mem_place3_title), context.getString(R.string.jeff_mem_place3_headline),
                context.getString(R.string.jeff_mem_place3_sub_headline_1), context.getString(R.string.jeff_mem_place3_sub_headline_1_info),
                context.getString(R.string.jeff_mem_place3_sub_headline_2), context.getString(R.string.jeff_mem_place3_sub_headline_2_info),
                context.getString(R.string.jeff_mem_place3_location), R.drawable.jefferson_memorial_place));

        places.add(new Places(context.getString(R.string.lib_cong_place4_title), context.getString(R.string.lib_cong_place4_headline),
                context.getString(R.string.lib_cong_place4_sub_headline1), context.getString(R.string.lib_cong_place4_sub_headline1_info),
                context.getString(R.string.lib_cong_place4_sub_headline2), context.getString(R.string.lib_cong_place4_sub_headline2_info),
                context.getString(R.string.lib_cong_place4_location), R.drawable.library_of_congress_place));

        places.add(new Places(context.getString(R.string.air_space_place5_title), context.getString(R.string.air_space_place5_headline),
                context.getString(R.string.air_space_place5_headline1), context.getString(R.string.air_space_place5_headline1_info),
                context.getString(R.string.air_space_place5_headline2), context.getString(R.string.air_space_place5_headline2_info),
                context.getString(R.string.air_space_place5_location), R.drawable.national_air_space_museum_place));

        places.add(new Places(context.getString(R.string.national_his_place6_title), context.getString(R.string.national_his_place6_headline),
                context.getString(R.string.national_his_place6_sub_headline1), context.getString(R.string.national_his_place6_sub_headline1_info),
                context.getString(R.string.national_his_place6_sub_headline2), context.getString(R.string.national_his_place6_sub_headline2_info),
                context.getString(R.string.national_his_place6_location), R.drawable.national_museum_natural_history_place));

        places.add(new Places(context.getString(R.string.washing_mon_place7_title), context.getString(R.string.washing_mon_place7_headline),
                context.getString(R.string.washing_mon_place7_sub_headline_1), context.getString(R.string.washing_mon_place7_sub_headline_1_info),
                context.getString(R.string.washing_mon_place7_sub_headline2), context.getString(R.string.washing_mon_place7_sub_headline2_info),
                context.getString(R.string.washing_mon_place7_location), R.drawable.washington_monument_place));
        return places;
    }

    public List<Hotels> getHotelsData(Context context){

        List<Hotels> hotels = new ArrayList<>();

        hotels.add(new Hotels(context.getString(R.string.normandy_hotel1_title), context.getString(R.string.normandy_hotel1_info),
                context.getString(R.string.normandy_hotel1_location),context.getString(R.string.normandy_hotel_contact),
                context.getString(R.string.normandy_hotel1_booking), context.getString(R.string.normandy_hotel1_site),
                R.drawable.normandy_hotel));

        hotels.add(new Hotels(context.getString(R.string.hyatt_place_hotel2_title), context.getString(R.string.hyatt_place_hotel2_info),
                context.getString(R.string.hyatt_place_hotel2_location),context.getString(R.string.hyatt_place_hotel2_contact),
                context.getString(R.string.hyatt_place_hotel2_booking), context.getString(R.string.hyatt_place_hotel2_site),
                R.drawable.hyatt_place_hotel));

        hotels.add(new Hotels(context.getString(R.string.hilton_hotel3_title), context.getString(R.string.hilton_hotel3_info),
                context.getString(R.string.hilton_hotel3_location),context.getString(R.string.hilton_hotel3_contact),
                context.getString(R.string.hilton_hotel3_booking), context.getString(R.string.hilton_hotel3_site),
                R.drawable.hilton_garden_inn_hotel));

        hotels.add(new Hotels(context.getString(R.string.holiday_inn_hotel4_title), context.getString(R.string.holiday_inn_hotel4_info),
                context.getString(R.string.holiday_inn_hotel4_location),context.getString(R.string.holiday_inn_hotel4_contact),
                context.getString(R.string.holiday_inn_hotel4_booking), context.getString(R.string.holiday_inn_hotel4_site),
                R.drawable.holiday_inn_hotel));

        hotels.add(new Hotels(context.getString(R.string.capitol_skyline_hotel5_title), context.getString(R.string.capitol_skyline_hotel5_info),
                context.getString(R.string.capitol_skyline_hotel5_location),context.getString(R.string.capitol_skyline_hotel5_contact),
                context.getString(R.string.capitol_skyline_hotel5_booking), context.getString(R.string.capitol_skyline_hotel5_site),
                R.drawable.capital_skyline_hotel));

        return hotels;
    }

    public List<Restaurants> getRestaurantsData(Context context){

        List<Restaurants> restaurants = new ArrayList<>();

        restaurants.add(new Restaurants(context.getString(R.string.osteria_morini_restaurant1_title), context.getString(R.string.osteria_morini_restaurant1_info),
                context.getString(R.string.osteria_morini_restaurant1_location), context.getString(R.string.osteria_morini_restaurant1_contact),
                context.getString(R.string.osteria_morini_restaurant1_booking), context.getString(R.string.osteria_morini_restaurant1_site),
                context.getString(R.string.osteria_morini_restaurant1_timings), context.getString(R.string.osteria_morini_restaurant1_rating),
                R.drawable.osteria_restaurant));

        restaurants.add(new Restaurants(context.getString(R.string.hard_rock_restaurant2_title), context.getString(R.string.hard_rock_restaurant2_info),
                context.getString(R.string.hard_rock_restaurant2_location), context.getString(R.string.hard_rock_restaurant2_contact),
                context.getString(R.string.hard_rock_restaurant2_booking), context.getString(R.string.hard_rock_restaurant2_site),
                context.getString(R.string.hard_rock_restaurant2_timings), context.getString(R.string.hard_rock_restaurant2_rating),
                R.drawable.hard_rock_restaurant));

        restaurants.add(new Restaurants(context.getString(R.string.cuba_libre_restaurant3_title), context.getString(R.string.cuba_libre_restaurant3_info),
                context.getString(R.string.cuba_libre_restaurant3_location), context.getString(R.string.cuba_libre_restaurant3_contact),
                context.getString(R.string.cuba_libre_restaurant3_booking), context.getString(R.string.cuba_libre_restaurant3_site),
                context.getString(R.string.cuba_libre_restaurant3_timing), context.getString(R.string.cuba_libre_restaurant3_rating),
                R.drawable.cuba_restaurant));

        restaurants.add(new Restaurants(context.getString(R.string.farmers_distillers_restaurant4_title), context.getString(R.string.farmers_distillers_restaurant4_info),
                context.getString(R.string.farmers_distillers_restaurant4_location), context.getString(R.string.farmers_distillers_restaurant4_contact),
                context.getString(R.string.farmers_distillers_restaurant4_booking), context.getString(R.string.farmers_distillers_restaurant4_site),
                context.getString(R.string.farmers_distillers_restaurant4_timing), context.getString(R.string.farmers_distillers_restaurant4_rating),
                R.drawable.farmers_distiller_restaurant));

        restaurants.add(new Restaurants(context.getString(R.string.asia_nine_restaurant5_title), context.getString(R.string.asia_nine_restaurant5_info),
                context.getString(R.string.asia_nine_restaurant5_location), context.getString(R.string.asia_nine_restaurant5_contact),
                context.getString(R.string.asia_nine_restaurant5_booking), context.getString(R.string.asia_nine_restaurant5_site),
                context.getString(R.string.asia_nine_restaurant5_timing), context.getString(R.string.asia_nine_restaurant5_rating),
                R.drawable.asia_nine_restaurant));

        restaurants.add(new Restaurants(context.getString(R.string.city_tap_restaurant6_title), context.getString(R.string.city_tap_restaurant6_info),
                context.getString(R.string.city_tap_restaurant6_location), context.getString(R.string.city_tap_restaurant6_contact),
                context.getString(R.string.city_tap_restaurant6_booking), context.getString(R.string.city_tap_restaurant6_site),
                context.getString(R.string.city_tap_restaurant6_timing), context.getString(R.string.city_tap_restaurant6_rating),
                R.drawable.city_tap_restaurant));

        return restaurants;
    }
}
