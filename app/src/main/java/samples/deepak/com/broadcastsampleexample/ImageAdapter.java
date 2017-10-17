package samples.deepak.com.broadcastsampleexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater layoutInflater;
    GridView gridView;

    public ImageAdapter(Context c, GridView gridView) {
        mContext = c;
        layoutInflater = LayoutInflater.from(c);
        this.gridView = gridView;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    static class ViewHolder {

        ImageView imageView;

    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;
        ImageView imageView;
        ViewHolder holder;
        if (itemView == null) {

            layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = layoutInflater.inflate(R.layout.grid_view_menu, null);
            holder = new ViewHolder();


            holder.imageView = (ImageView) itemView.findViewById(R.id.image_view_menu_image);


            itemView.setTag(holder);
        } else {
            holder = (ViewHolder) itemView.getTag();
        }


        holder.imageView.setImageResource(mThumbIds[position]);
        holder.imageView.getLayoutParams().height=gridView.getHeight()/2;
        return itemView;

    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.home_payment, R.drawable.home_withdrawl,
            R.drawable.home_fundtransfer, R.drawable.home_utility
    };
}