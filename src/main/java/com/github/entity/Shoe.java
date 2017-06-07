package com.github.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Created by tham on 6/7/17.
 */
@Entity
@Table(name = "shoe")
public class Shoe implements Serializable {

//    static final variable
    private static final long serialVersionUID = 40L;
    private static final Logger logger = Logger.getLogger(Shoe.class.getName());

    // static variable but not final
    @Column(name = "brand")
    private static String _brand="abs";

    // instance variable
    @Id
    @Column(name = "id")
    private int _id;
    @Column(name = "size")
    private int _size;
    @Column(name = "color")
    private String _color;

    // transient variable
    @Column(name = "is_running_shoe")
    private transient boolean _isRunningShoe;

    public Shoe() {
        super();
    }

    public Shoe(String _brand,int _id, int _size, String _color, boolean _isRunningShoe) {
        Shoe._brand = _brand;
        this._id = _id;
        this._size = _size;
        this._color = _color;
        this._isRunningShoe = _isRunningShoe;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static String get_brand() {
        return _brand;
    }

    public int get_id() {
        return _id;
    }

    public int get_size() {
        return _size;
    }

    public String get_color() {
        return _color;
    }

    public boolean is_isRunningShoe() {
        return _isRunningShoe;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_size(int _size) {
        this._size = _size;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public void set_isRunningShoe(boolean _isRunningShoe) {
        this._isRunningShoe = _isRunningShoe;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "_brand='" + _brand + '\'' +
                ", _id=" + _id +
                ", _size=" + _size +
                ", _color='" + _color + '\'' +
                ", _isRunningShoe=" + _isRunningShoe +
                '}';
    }
}
