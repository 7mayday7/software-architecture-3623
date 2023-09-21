package ModelElements;

import Service.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public Scene() {
        this.id = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.models = new ArrayList<>();
    }

    public List<Integer>  id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;

    public Type method1(Type type) {
        return null;
    }
    public Type method2(Type type1, Type type2) {
        return null;
    }
}
