import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

class Model {

    private static ObservableList<UpdateObject> modelList = FXCollections.observableArrayList();

    static void add(UpdateObject objectToAdd) {
        modelList.add(objectToAdd);
    }

    static ObservableList<UpdateObject> getModel() {
        return modelList;
    }
}