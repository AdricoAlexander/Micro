package com.example.healthyus.Data

import com.example.healthyus.R

object dataProvider {
    val doctor =
        konsultan(
            id = 1,
            name = "Lauren, M.Psi., Psikolog",
            desc = "Dengan latar belakang dalam psikologi perkembangan, saya berdedikasi untuk membantu individu dari berbagai rentang usia memahami dan memberikan saran praktis yang dapat saya terapkan dalam kehidupan sehari-hari.",
            time = "Senin - Sabtu, 08.00 - 21.00 WIB",
            spec = "CBT",
            docPicId = R.drawable.doctor1,
            rate = 4.9,
            review = 510
        )
    val doctorList = listOf(
        doctor,
        konsultan(
            id = 2,
            name = "Nicholas, M.Psi., Psikolog",
            desc = "Lulusan terbaik oxford jurusan Informatika tapi malah jadi psikolog",
            time = "Rabu - Sabtu, 10.00 - 20.00 WIB",
            spec = "S3 Informatika",
            docPicId = R.drawable.doctor2,
            rate = 4.8,
            review = 420
        ),
        konsultan(
            id = 3,
            name = "Asylaa, M.Psi., Psikolog",
            desc = "Memiliki latar belakang hebat seorang kharismatik / yang bisa di sebut warrior woman",
            time = "Selasa - kamis, 06.00 - 17.00 WIB",
            spec = "Alpha woman",
            docPicId = R.drawable.doctor3,
            rate = 4.7,
            review = 385
        ),
        konsultan(
            id = 4,
            name = "Chika, M.Psi., Psikolog",
            desc = "Cepat akrab dengan seseorang feel free to talk dan memiliki riwayat pendidikan sekolah tinggi bahasa jaksel",
            time = "Sabtu - Minggu, 15.00 - 20.00 WIB",
            spec = "Wichis Wooman",
            docPicId = R.drawable.doctor4,
            rate = 4.8,
            review = 430
        ),
        konsultan(
            id = 5,
            name = "Rio, M.Psi., Psikolog",
            desc = "Seorang single parent yang memiliki tujuan hidup berat dan dipanggil rio karena tinggal di Rio de Janiero xixixix",
            time = "Senin - Minggu, 00.00 - 00.00 WIB",
            spec = "Tidak kenal lelah",
            docPicId = R.drawable.doctor5,
            rate = 4.9,
            review = 650
        ),
        konsultan(
            id = 5,
            name = "Robert, M.Psi., Psikolog",
            desc = "Pembangkang ya orang ini adalah pembangkang sejati dari kehidupannya yaitu melawan untuk menjadi malas",
            time = "Senin - Senin, 00.00 - 00.00 WIB",
            spec = "Bravery or Stupidity",
            docPicId = R.drawable.doctor6,
            rate = 4.8,
            review = 423
        ),
        konsultan(
            id = 6,
            name = "Annisa, M.Psi., Psikolog",
            desc = "Orang indonesia pertama yang menjadi psikologi di Prancis (Perapatan Ciamis)",
            time = "Senin - Jumat, 07.00 - 13.00 WIB",
            spec = "Happiness Bringer",
            docPicId = R.drawable.doctor7,
            rate = 4.9,
            review = 610
        ),
    )
}