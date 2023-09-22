package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public ModelStore(IModelChangedObserver[] changedObservers) throws Exception {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(7, models, flashes, cameras));

    }

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;

    // Регистриует изменение модели
    @Override
    public void notifyChange(IModelChanger sender) {

    }

    // Возвращает scene по ID
    public Scene getScene(int id) {
        return null;
    }
}
