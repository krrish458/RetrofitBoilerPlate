package Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {
    @SerializedName("data")
    private List<Podcasts> data = new ArrayList<Podcasts>();

    /**
     *
     * @return
     * The data
     */
    public List<Podcasts> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<Podcasts> data) {
        this.data=data;
    }

}