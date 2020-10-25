package com.bcind.day20;

public class Engine extends Part {
    private String _eng_type;
//    private String _id;
//    private String _mfg;
//    private String _desc;

    public Engine(String engType, String id, String mfg, String desc){
        super(id, mfg, desc);
        this._eng_type = engType;
//        this._id = id;
//        this._mfg = mfg;
//        this._desc = desc;
    }

//    public String get_id() {
//        return _id;
//    }
//
//    public String get_desc() {
//        return _desc;
//    }

//    public String get_mfg() {
//        return _mfg;
//    }

    public String get_eng_type() {
        return _eng_type;
    }
}
