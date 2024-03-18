package domain.entities;

import java.util.List;

public class Concesionary {
    private int _id;
    private String _name;
    private List<Car> _cars;

    public Concesionary(int id, String name){
        super();
        this._id = id;
        this._name = name;
    }

    public int get_id() {
        return _id;
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public List<Car> get_cars() {
        return _cars;
    }

    public void set_cars(List<Car> _cars) {
        this._cars = _cars;
    }
}
