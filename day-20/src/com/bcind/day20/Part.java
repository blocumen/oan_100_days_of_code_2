package com.bcind.day20;

public class Part {
    private String _id;
    private String _mfg;
    private String _desc;

    public Part(String _id, String _mfg, String _desc){
        this._id = _id;
        this._mfg = _mfg;
        this._desc = _desc;
    }

    public String get_id(){
        return _id;
    }

    public String get_mfg(){
        return _mfg;
    }

    public String get_desc(){
        return _desc;
    }
}
