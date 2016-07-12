package bean;

import java.io.Serializable;

/**
 * Created by YF on 2016/7/12.
 */
public class ItemBean implements Serializable {

    private boolean isChecked;

    private boolean isChecked(){
        return isChecked;
    }

    private void setChecked(boolean checked){
        isChecked = checked;
    }
}
