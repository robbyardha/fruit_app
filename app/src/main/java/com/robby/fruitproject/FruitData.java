package com.robby.fruitproject;

import java.util.ArrayList;

public class FruitData {
    public static String[][] data = new String[][]{
            {"Buah Nangka",
                    "Nama Latin Artocarpus heterophyllus\n" +
                            "Bahasa Inggris Jack Fruit\n" +
                            "Pohon Buah yang masuk pada suku Moraceae\n" +
                            "Manfaat Buah Nangka\n" +
                            "1. Dapat mencegah penyakit jantung\n" +
                            "2. Dapat mencegah Anemia\n" +
                            "3. Dapat menjadi obat Asma\n" +
                            "4. Dapat menjaga kesehatan kelenjar tiroid\n" +
                            "5. Dapat Menjaga kesehatan tulang\n" +
                            "6. Kandungan magnesium pada nangka sangat baik untuk tulang.\n" +
                            "7. Dapat menjadi anti Kanker dan dapat mencegah penuaan dini\n" +
                            "8. Dapat dijadikan Sumber Energi\n" +
                            "9. Dapat menjadi Obat Borok dan Gangguan Pencernaan\n" +
                            "10. Dapat menjaga Kesehatan Kulit dan Mata\n" +
                            "11. Dapat Menurunkan Tekanan Darah(Hipertensi)",
                    "https://cdn.akurat.co/images/uploads/images/akurat_20181112091418_cAVE37.jpg"},

            {"Buah Alpukat",
                    "Nama Latin Persea americana\n" +
                            "Bahasa Inggris Avocado\n" +
                            "Manfaat Buah alpukat\n" +
                            "1. Menurunkan Kolesterol\n" +
                            "2. Mengandung Lebih Banyak Kalium\n" +
                            "3. Mengatasi Kanker\n" +
                            "4. Detoks Tubuh(Membuang Racun Tubuh)\n" +
                            "5. Dapat Membantu Menurunkan Berat Badan\n" +
                            "6. Menurunkan Stres",
                    "https://www.pemburuombak.com/media/k2/items/cache/67494d9fb833f19a8b4d612ba6cf039d_XL.jpg"},

            {"Buah Nanas",
                    "Nama Latin Ananas comosus\n" +
                            "Bahasa Inggris Pineapple\n" +
                            "Manfaat Buah Nanas\n" +
                            "1. Melawan radikal bebas\n" +
                            "2. Menjaga kesehatan jantung\n" +
                            "3. Membantu menurunkan kadar lemak\n" +
                            "4. Meningkatkan daya tahan tubuh\n" +
                            "5. Membuat tulang lebih sehat\n" +
                            "6. Menyehatkan mata\n" +
                            "7. Mencegah terbentuknya sel kanker",
                    "https://doktersehat.com/wp-content/uploads/2018/09/manfaat-buah-nanas-doktersehat.jpg"},

            {"Buah Apel",
                    "Nama Latin Malus domestica\n" +
                            "Bahasa Inggris Apple\n" +
                            "Manfaat Buah Apel\n" +
                            "1. Mencegah penyakit stroke\n" +
                            "2. Membantu diet\n" +
                            "3. Menetralisir kadar gula darah\n" +
                            "4. Menurunkan Kolesterol\n" +
                            "5. Meningkatkan kesehatan kulit\n" +
                            "6. Mengurangi risiko penyakit jantung\n" +
                            "7. Melancarkan buang air besar",
                    "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2018/05/14/2533869461.jpg"},

            {"Buah Jeruk",
                    "Nama Latin Citrus\n" +
                            "Bahasa Inggris Orange\n" +
                            "Manfaat Buah Jeruk\n" +
                            "1. Meredakan Sembelit\n" +
                            "2. Mengatur Tekanan Darah\n" +
                            "3. Mencegah Kanker \n" +
                            "4. Melindungi Tubuh dari Penyakit Jantung\n" +
                            "5. Melawan Infeksi Virus\n" +
                            "6. Membersihkan Darah",
                    "https://asset-a.grid.id/crop/30x4:593x367/700x465/photo/2018/12/30/3529843069.jpg"},

            {"Buah Anggur",
                    "Nama Latin Vitis vinivera\n" +
                            "Bahasa Inggris Grape\n" +
                            "Manfaat Buah Anggur\n" +
                            "1. Dapat Mencegah Kanker\n" +
                            "2. Mengobati Sembelit atau susah BAB\n" +
                            "3. Mengurangi resiko penyakit jantung\n" +
                            "4. Menghilangkan Kerutan wajah\n" +
                            "5. Pemutih Gigi\n" +
                            "6. Obat Migrain\n" +
                            "7. Mengatasi gangguan ginjal",
                    "https://cdn0-production-images-kly.akamaized.net/CMzdK-FW-v0yIQwJ28lJzgBbS_M=/680x383/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2530795/original/049375700_1544695452-cara-menyimpan-buah-anggur-dalam-waktu-lama-agar-awet-segar.jpg"},

            {"Buah Strawberry",
                    "Nama Latin Fragaria virginiana\n" +
                            "Bahasa Inggris Strawberry \n" +
                            "Manfaat Buah Stroberi\n" +
                            "1. Mengurangi flu dan meningkatkan sistem imun\n" +
                            "2. Mengendalikan berat badan\n" +
                            "3. Mengurangi kolstrol dan risiko penyakit kardiovaskular\n" +
                            "4. Mengurangi risiko kanker\n" +
                            "5. Menyehatkan Mata",
                    "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/5/25/7003248/7003248_b082540a-3f8c-4223-a137-8aebf2661081_420_420.jpg"},

            {"Buah Salak",
                    "Nama Latin Salacca zalacca\n" +
                            "Bahasa Inggris Snake fruit / zalacca\n" +
                            "Manfaat Buah Salak\n" +
                            "1. Menopang stamina tubuh\n" +
                            "2. Meningkatkan Ingatan Otak\n" +
                            "3. Meningkatkan Imunitas\n" +
                            "4. Mencerahkan Kulit\n" +
                            "5. Dapat Menjaga Berat badan\n" +
                            "6. Menjaga Kepadatan Tulang\n" +
                            "7. Memperbaiki Jaringan Tubuh yang rusak",
                    "https://titiknol.co.id/images/post/2018/03/titiknol_1nk__buah_salak.jpg"},

            {"Buah Belimbing",
                    "Nama Latin Averrhoa carambola\n" +
                            "Bahasa Inggris Star Fruit\n" +
                            "Manfaat Buah Belimbing\n" +
                            "1. Mengurangi resiko peradangan & anti radikal bebas\n" +
                            "2. Mencegah dari penyakit kanker\n" +
                            "3. Membantu produksi ASI\n" +
                            "4. Menyehatkan Kulit\n" +
                            "5. Menurunkan Kolesterol\n" +
                            "6. Menjaga kadar gula darah\n" +
                            "7. Mengatasi Maag",
                    "https://cdn2.tstatic.net/tribunnews/foto/bank/images/ilustrasi-starfruit.jpg"},

            {"Buah Bluberry",
                    "Nama Latin Cyanococcus\n" +
                            "Bahasa Inggris \tBlueberry\n" +
                            "Manfaat Buah Bluberi\n" +
                            "1. Meningkatkan daya tahan tubuh\n" +
                            "2. Menstimulasi Otak (Otak menjadi Aktif)\n" +
                            "3. Mencegah Kulit Kering\n" +
                            "4. Menajamkan Penglihatan\n" +
                            "5. Mencegah Kanker\n" +
                            "6. Mencegah infeksi saluran kemih\n" +
                            "7. Menghilangkan lemak di perut\n" +
                            "8. Mengobati selulit",
                    "http://promkes.kemkes.go.id/imagex/content/a6e9b977manfaat-buah-blueberry.jpg"},

            {"Buah Pisang",
                    "Nama Latin Musa Musaceae\n" +
                            "Bahasa Inggris Banana\n" +
                            "Manfaat Buah Pisang\n" +
                            "1. Menurunkan tekanan darah\n" +
                            "2. Menurunkan risiko stroke\n" +
                            "3. Meningkatkan stamina\n" +
                            "4. Kaya akan magnesium untuk pembentukan protein dan mempertahankan fungsi otot & saraf\n" +
                            "5. Mengandung serat tinggi\n" +
                            "6. Menyehatkan kulit\n" +
                            "7. Mencegah Asma\n" +
                            "8. Membantu menjaga daya ingat\n" +
                            "9. Karbohidrat tinggi (mengenyangkan)",
                    "https://1.bp.blogspot.com/-jjUsQq2LcAk/V7rbl0K0GQI/AAAAAAAABXc/ybfOy08kldcm5y6l3lKkpMEDN-6MD0h2wCLcB/s1600/gambar-buah-pisang-cavendish_www.buahaz.com_.jpg"}
    };

    public static ArrayList<Fruit> getListData(){
        ArrayList<Fruit> list = new ArrayList<>();
        for (String[] aData : data) {
            Fruit fruit = new Fruit();
            fruit.setNama(aData[0]);
            fruit.setDeskripsi(aData[1]);
            fruit.setFoto(aData[2]);
            list.add(fruit);
        }
        return list;
    }
}
