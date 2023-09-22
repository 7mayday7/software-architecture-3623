package ModelElements;

import Service.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;


    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        this.flashes = flashes;

        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Нужна хотябы одна модель");
        }
    }

    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }
}
