package rodrigues.alves.victor.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    int navigatonOpSelected = R.id.gridViewOp;

    public MainViewModel (@NonNull Application application) {
        super(application);
    }

    public int getNavigatonOpSelected() {
        return navigatonOpSelected;
    }

    public void setNavigatonOpSelected (int NavigationOpSelected) {
        this.navigatonOpSelected= navigatonOpSelected;
    }
}
