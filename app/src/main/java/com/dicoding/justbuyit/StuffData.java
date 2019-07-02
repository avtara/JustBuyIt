package com.dicoding.justbuyit;

import java.util.ArrayList;

public class StuffData {
    public static String[][] data = new String[][]{
            {"Samsung Galaxy J6","3.000.000","Toko Avtara","4.4","90%","200","https://images.samsung.com/is/image/samsung/pk-galaxy-j6-j600-sm-j600fzvgpak-frontviolet-100425833?$PD_GALLERY_L_JPG$","Tidak ada deskripsi"},
            {"Samsung Galaxy J6+","3.250.000","Toko Avtara","4.4","90%","222","https://images.samsung.com/is/image/samsung/no-galaxy-j6plus-j610-sm-j610fzknnee-frontblack-126189050?$PD_GALLERY_L_JPG$","Tidak ada deskripsi"},
            {"Samsung Galaxy J7 Pro","3.500.000","Toko Avtara","4.4","91%","332","https://images.samsung.com/is/image/samsung/ph-galaxy-j7-2017-sm-j730gzkgxtc-frontblack-69641682?$PD_GALLERY_L_JPG$","Tidak ada deskripsi"},
            {"Samsung Galaxy J8","3.750.000","Toko Avtara","4.4","92%","666","https://images.samsung.com/is/image/samsung/ph-galaxy-j8-j810-sm-j810yzkdxtc-frontblack-106584181?$PD_GALLERY_L_JPG$","Tidak ada deskripsi"},
            {"Samsung Galaxy A6","3.100.000","Toko Avtara","4.4","93%","231","https://images.samsung.com/is/image/samsung/vn-galaxy-a6-sm-a600-sm-a600gzbdxxv-frontblue-99820692?$PD_GALLERY_L_JPG$","Tidak ada deskripsi"},
            {"Samsung Galaxy A7","3.200.000","Toko Avtara","4.4","89%","512","https://images.samsung.com/is/image/samsung/ph-galaxy-a7-a750-sm-a750gzbuxtc-frontblue-122180658?$PD_GALLERY_L_JPG$","Tidak ada deskripsi"},
            {"Samsung Galaxy S6","2.000.000","Toko Avtara","4.4","88%","321","https://images.samsung.com/is/image/samsung/latin_en-galaxy-s6-g920i-sm-g920izkatpa-000000001-front-black?$PD_GALLERY_L_JPG$","Tidak ada deskripsi"},
            {"Samsung Galaxy S7","4.000.000","Toko Avtara","4.4","95%","521","https://image-us.samsung.com/SamsungUS/home/mobile/phones/pdp/sm-g935/gallery/SMG935_edge_102116.jpg?$product-details-jpg$","Tidak ada deskripsi"},
            {"Samsung Galaxy S8","7.000.000","Toko Avtara","4.4","86%","21","https://image-us.samsung.com/SamsungUS/home/mobile/mobile-accessories/pdp/SM-G950UZKAATT/gallery/S8_Black_front.jpg?$product-details-jpg$","Tidak ada deskripsi"},
            {"Samsung Galaxy S9","8.000.000","Toko Avtara","4.4","97%","9","https://image.samsung.com/sg/smartphones/galaxy-s9/shop/buyingtool/product/product_galaxys9_lilacpurple_01.png","Tidak ada deskripsi"},
            {"Samsung Galaxy S10","12.000.000","Toko Avtara","4.4","100%","8","https://azcd.harveynorman.com.au/media/catalog/product/cache/21/image/992x558/9df78eab33525d08d6e5fb8d27136e95/s/a/samsung-galaxy-s10_128gb-white.jpg","Tidak ada deskripsi"},
            {"Samsung Galaxy S10e","19.000.000","Toko Avtara","4.4","100%","7","https://image-us.samsung.com/SamsungUS/mobile/phones/06102019-new/First_S10e_Lockup1_Blue_gallery.jpg?$product-details-jpg$","Tidak ada deskripsi"}
    };

    public static ArrayList<Stuff> getListData(){
        ArrayList<Stuff> list= new ArrayList<>();
        for (String[] aData : data){
            Stuff stuff = new Stuff();
            stuff.setName(aData[0]);
            stuff.setPrice(aData[1]);
            stuff.setShop(aData[2]);
            stuff.setRating(aData[3]);
            stuff.setTx_success(aData[4]);
            stuff.setWhislist(aData[5]);
            stuff.setPhoto(aData[6]);
            stuff.setSpec(aData[7]);
        }

        return list;
    }
}
