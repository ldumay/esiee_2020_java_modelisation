package fr.ldumay.others;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldumay
 */

/**
 * Class - DateConversion
 * <br/>
 * <br/>- public String year
 * <br/>- public String month
 * <br/>- public String day
 * <br/>Constructor :
 * <br/>- DateConversion()
 * <br/>
 * <br/>Functions :
 * <br/>- DateConversion.dateConvertTypeDate(Date date, Locale localeSelected)
 * <br/>  |--> Return String
 * <br/>
 * <br/>End.
 */
public class DateConversion {
    
    private String year = null;
    private String month = null;
    private String day = null;
    
    /**
     * Constructor
     */
    public DateConversion(){}
    
    /**
     * Conversion Date to String.
     * 
     * @param date String
     * @param localeSelected Locale
     * @return newDate type String
     */
    public String dateConvertTypeDate(Date date, Locale localeSelected){
        //-
        if(date==null){ date = new Date(); }
        if(localeSelected==null){ localeSelected = Locale.getDefault(); }
        //-
        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
            DateFormat.SHORT,
            DateFormat.SHORT,
            localeSelected
        );
        String newDate = shortDateFormat.format(date);
        return newDate;
    }
    
    public String dateConvertTypeString(String date,String local, String localResult){
        String language = null;
        String newDate = null;
        //-
        if(local==null){ local=""; }
        //-
        switch(local){
            case "FR": language = "fr"; break;
            case "US": language = "us"; break;
            case "EN": language = "en"; break;
            default:
                Locale currentLocale = Locale.getDefault();
                language = currentLocale.getLanguage();
                break;
        }
        //-
        switch(language){
            //-Conversion FR to US
            case "fr":
                this.convertDateHashString(date, "/");
                newDate = year+"-"+month+"-"+day;
                break;
        }
        //-
        return newDate;
    }
    
    private String[] convertDateHashString(String date, String cutElement){
        String year = null;
        String month = null;
        String day = null;
        String[] dateHash = date.split(cutElement);
        if(dateHash[0].length()>2){
            year = dateHash[0];
            month = dateHash[1];
            day = dateHash[2];
        } else if(dateHash[2].length()>2){
            year = dateHash[2];
            month = dateHash[1];
            day = dateHash[0];
        }
        return dateHash;
    }
}
