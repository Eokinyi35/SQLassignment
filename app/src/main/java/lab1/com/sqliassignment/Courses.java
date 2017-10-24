package lab1.com.sqliassignment;

/**
 * Created by Eokinyi on 10/23/2017.
 */

public class Courses {
    //private variables
    int _cid;
    String _cname;

    public Courses(){}
    public Courses(int id, String name){
        this._cid = id;
        this._cname = name;
    }
    public Courses(String name){
        this._cname = name;
    }

    public int getCID() {
        return _cid;
    }

    public void setCID(int _cid) {
        this._cid = _cid;
    }

    public String getCName() {
        return _cname;
    }

    public void setCName(String _cname) {
        this._cname = _cname;
    }

}
