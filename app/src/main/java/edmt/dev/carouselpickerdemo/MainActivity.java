package edmt.dev.carouselpickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class MainActivity extends AppCompatActivity {

    CarouselPicker carouselPicker1,carouselPicker2,carouselPicker3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselPicker1 = (CarouselPicker)findViewById(R.id.carouselPicker1);
        carouselPicker2 = (CarouselPicker)findViewById(R.id.carouselPicker2);
        carouselPicker3 = (CarouselPicker)findViewById(R.id.carouselPicker3);

        //Carousel 1 with all images
        List<CarouselPicker.PickerItem> itemsImages = new ArrayList<>();
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        CarouselPicker.CarouselViewAdapter imageAdapter = new CarouselPicker.CarouselViewAdapter(this,itemsImages,0);
        carouselPicker1.setAdapter(imageAdapter);

        //Carousel 2 with all text
        List<CarouselPicker.PickerItem> textItems = new ArrayList<>();
        textItems.add(new CarouselPicker.TextItem("One",20)); // 20 is text size (sp)
        textItems.add(new CarouselPicker.TextItem("Two",20)); // 20 is text size (sp)
        textItems.add(new CarouselPicker.TextItem("Three",20)); // 20 is text size (sp)
        CarouselPicker.CarouselViewAdapter textAdapter = new CarouselPicker.CarouselViewAdapter(this,textItems,0);
        carouselPicker2.setAdapter(textAdapter);

        //Carousel 2 with image and text
        List<CarouselPicker.PickerItem> mixItems = new ArrayList<>();
        mixItems.add(new CarouselPicker.TextItem("One",20)); // 20 is text size (sp)
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        mixItems.add(new CarouselPicker.TextItem("Three",20)); // 20 is text size (sp)
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        CarouselPicker.CarouselViewAdapter mixAdapter = new CarouselPicker.CarouselViewAdapter(this,mixItems,0);
        carouselPicker3.setAdapter(mixAdapter);

    }
}
