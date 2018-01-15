package com.sqlitedatabase.sqlite.utils;


import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AppConst {






    public static final String phone = "phone";




    public static final String image = "image";


    //About us page responses

    public static final String idParam = "id";
    public static final String aboutUsEn = "about_us";
    public static final String aboutUsAr = "about_us_ar";
    public static final String termsConditionsEn = "terms_conditions";
    public static final String termsConditionsAr = "terms_conditions_ar";
    public static final String policyProceduresEn = "policy_procedures";
    public static final String policyProceduresAr = "policy_procedures_ar";
    public static final String gpsDistance = "gps_distance";
    public static final String address = "address";
    public static final String fb = "fb";
    public static final String tw = "tw";
    public static final String gp = "gp";
    public static final String ig = "ig";









    public static final String countryId = "country_id";

    public static final String cityId = "city_id";
    public static final String cityNameEn = "city_name";
    public static final String cityNameAr = "city_name_ar";
    public static final String districtId = "district_id";
    public static final String districtNameEn = "district_name";
    public static final String districtNameAr = "district_name_ar";





    public static final String addressEn = "address_en";
    public static final String addressAr = "address_ar";

    public static final String categoryNameEn = "category_name";
    public static final String categoryNameAr = "category_name_ar";
    public static final String descriptionEn = "description";
    public static final String descriptionAr = "description_ar";
    public static final String categoryColor = "color";
    public static final String bannerImage = "banner_image";



;

    //param signup

    public static final String email = "U_Email";


    public static final String questionEn = "question";
    public static final String answerEn = "answer";
    public static final String questionAr = "question_ar";
    public static final String answerAr = "answer_ar";

    //video response

    public static final String titleEn = "title";
    public static final String titleAr = "title_ar";
    public static final String video = "video";

    private static final String keyCreatedAt = "key_created_at";

    public static final String TABLE_ABOUT_COMPANY = "about_company";
    public static final String TABLE_DISTRICT = "district";
    public static final String TABLE_CITY = "city";
    public static final String TABLE_FAQ = "faqs";
    public static final String TABLE_VIDEOS = "videos";
    public static final String TABLE_CATEGORY = "category";
    public static final String TABLE_CATEGORY_HEALTH = "category_health";

    //create table COMPANY
    public static final String CREATE_TABLE_COMPANY = "CREATE TABLE " + TABLE_ABOUT_COMPANY
            + "(" + idParam + " INTEGER PRIMARY KEY NOT NULL," + gpsDistance + " INTEGER,"
            + aboutUsEn + " VARCHAR," + aboutUsAr + " VARCHAR,"
            + termsConditionsEn + " VARCHAR," + termsConditionsAr + " VARCHAR,"
            + policyProceduresEn + " VARCHAR," + policyProceduresAr + " VARCHAR,"
            + addressEn + " VARCHAR," + addressAr + " VARCHAR,"
            + phone + " VARCHAR," + email + " VARCHAR,"
            + fb + " VARCHAR," + tw + " VARCHAR," + gp + " VARCHAR,"
            + ig + " VARCHAR," + image + " VARCHAR,"
            + keyCreatedAt + " TIMESTAMP DEFAULT (DateTime('now')))";

    //create table TABLE_DISTRICT
    public static final String CREATE_TABLE_DISTRICT = "CREATE TABLE " + TABLE_DISTRICT
            + "(" + districtId + " INTEGER PRIMARY KEY NOT NULL," + cityId + " INTEGER,"
            + districtNameEn + " VARCHAR," + districtNameAr + " VARCHAR,"
            + keyCreatedAt + " TIMESTAMP DEFAULT (DateTime('now'))," + " FOREIGN KEY (" + cityId + ") REFERENCES "
            + TABLE_CITY + "(" + districtId + ") ON DELETE SET DEFAULT ON UPDATE SET DEFAULT MATCH FULL )";

    //create table CITY
    public static final String CREATE_TABLE_CITY = "CREATE TABLE " + TABLE_CITY
            + "(" + cityId + " INTEGER PRIMARY KEY NOT NULL," + countryId + " INTEGER,"
            + cityNameEn + " VARCHAR," + cityNameAr + " VARCHAR,"
            + keyCreatedAt + " TIMESTAMP DEFAULT (DateTime('now')))";

    //create table FAQ
    public static final String CREATE_TABLE_FAQ = "CREATE TABLE " + TABLE_FAQ
            + "(" + idParam + " INTEGER PRIMARY KEY NOT NULL,"
            + questionEn + " VARCHAR," + questionAr + " VARCHAR,"
            + answerEn + " VARCHAR," + answerAr + " VARCHAR,"
            + keyCreatedAt + " TIMESTAMP DEFAULT (DateTime('now')))";

    //create table VIDEOS
    public static final String CREATE_TABLE_VIDEOS = "CREATE TABLE " + TABLE_VIDEOS
            + "(" + idParam + " INTEGER PRIMARY KEY NOT NULL,"
            + titleEn + " VARCHAR," + titleAr + " VARCHAR,"
            + video + " VARCHAR," + image + " VARCHAR,"
            + keyCreatedAt + " TIMESTAMP DEFAULT (DateTime('now')))";

    //create table CATEGORY
    public static final String CREATE_TABLE_CATEGORY = "CREATE TABLE " + TABLE_CATEGORY
            + "(" + idParam + " INTEGER NOT NULL,"
            + categoryNameEn + " VARCHAR," + categoryNameAr + " VARCHAR," + descriptionEn + " VARCHAR," + descriptionAr + " VARCHAR," + categoryColor + " VARCHAR DEFAULT '000000'," + bannerImage + " VARCHAR,"
            + keyCreatedAt + " TIMESTAMP DEFAULT (DateTime('now')))";



    //create table Health Category

    public static final String CREATE_TABLE_CATEGORY_HEALTH = "CREATE TABLE " + TABLE_CATEGORY_HEALTH
            + "(" + idParam + " INTEGER NOT NULL,"
            + categoryNameEn + " VARCHAR," + categoryNameAr + " VARCHAR," + descriptionEn + " VARCHAR," + descriptionAr + " VARCHAR," + categoryColor + " VARCHAR DEFAULT '000000'," + bannerImage + " VARCHAR,"
            + keyCreatedAt + " TIMESTAMP DEFAULT (DateTime('now')))";









}

