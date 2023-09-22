package ModelElements;

import java.util.ArrayList;
import java.util.List;

// Класс полигональной модели
public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<>();
    }
}
