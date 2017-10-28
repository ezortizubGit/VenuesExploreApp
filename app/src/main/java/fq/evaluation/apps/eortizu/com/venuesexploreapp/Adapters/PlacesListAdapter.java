package fq.evaluation.apps.eortizu.com.venuesexploreapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Place;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.R;
//adapter for main activity RecycleView
public class PlacesListAdapter  extends RecyclerView.Adapter<PlacesListAdapter.ViewHolder> {

    private List<Place> places;

    public PlacesListAdapter(){
        this.places=new ArrayList<Place>();
    }

    public void setPlaces(List<Place> places){
        this.places=places;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewNamePlace;
        private TextView textViewCategory;
        private TextView textViewTipsText;
        private TextView textViewHours;
        public ViewHolder(View view){
            super(view);
            textViewNamePlace=(TextView)view.findViewById(R.id.textViewNamePlace);
            textViewCategory=(TextView)view.findViewById(R.id.textViewCategory);
            textViewTipsText=(TextView)view.findViewById(R.id.textViewTipsText);
            textViewHours=(TextView)view.findViewById(R.id.textViewHours);
        }
    }
    @Override
    public PlacesListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_place_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlacesListAdapter.ViewHolder holder, int position) {
        holder.textViewNamePlace.setText(places.get(position).getVenue().getName());
        holder.textViewCategory.setText(places.get(position).getVenue().getCategories().get(0).getName());
        try{
            holder.textViewTipsText.setText(places.get(position).getTips().get(0).getText());
        }
        catch (Exception e)
        {
            holder.textViewTipsText.setHeight(0);
        }

        try {
            holder.textViewHours.setText(places.get(position).getVenue().getHours().isOpen()?"Abierto":"Cerrado");
        }catch (Exception e){
            holder.textViewHours.setHeight(0);
        }

    }

    @Override
    public int getItemCount() {
        return places.size();
    }
}
