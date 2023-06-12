package com.diagnese.app.core.data.network.disease

import com.google.gson.annotations.SerializedName

data class SymptomsResponse(

	@field:SerializedName("code")
	val code: Int,

	@field:SerializedName("data")
	val data: SymptomsData,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class SymptomsData(

	@field:SerializedName("gelisah")
	val gelisah: Int,

	@field:SerializedName("bengkak_ekstremitas")
	val bengkakEkstremitas: Int,

	@field:SerializedName("nyeri_leher")
	val nyeriLeher: Int,

	@field:SerializedName("mata_merah")
	val mataMerah: Int,

	@field:SerializedName("hidung_tersumbat")
	val hidungTersumbat: Int,

	@field:SerializedName("perubahan_suasana_hati")
	val perubahanSuasanaHati: Int,

	@field:SerializedName("sakit_perut")
	val sakitPerut: Int,

	@field:SerializedName("menerima_transfusi_darah")
	val menerimaTransfusiDarah: Int,

	@field:SerializedName("kelenjar_getah_bening_membengkak")
	val kelenjarGetahBeningMembengkak: Int,

	@field:SerializedName("keluar_darah_buang_air_kecil")
	val keluarDarahBuangAirKecil: Int,

	@field:SerializedName("kulit_kekuningan")
	val kulitKekuningan: Int,

	@field:SerializedName("jantung_berdetak_cepat")
	val jantungBerdetakCepat: Int,

	@field:SerializedName("merinding")
	val merinding: Int,

	@field:SerializedName("pembengkakan_perut")
	val pembengkakanPerut: Int,

	@field:SerializedName("diare")
	val diare: Int,

	@field:SerializedName("iritasi_tenggorokan")
	val iritasiTenggorokan: Int,

	@field:SerializedName("kadar_gula_tidak_teratur")
	val kadarGulaTidakTeratur: Int,

	@field:SerializedName("benjolan_pada_kulit")
	val benjolanPadaKulit: Int,

	@field:SerializedName("dahak_sputum")
	val dahakSputum: Int,

	@field:SerializedName("dahak_berdarah")
	val dahakBerdarah: Int,

	@field:SerializedName("ucapan_tidak_jelas")
	val ucapanTidakJelas: Int,

	@field:SerializedName("nyeri_lutut")
	val nyeriLutut: Int,

	@field:SerializedName("kuku_rapuh")
	val kukuRapuh: Int,

	@field:SerializedName("urine_menguning")
	val urineMenguning: Int,

	@field:SerializedName("demam_tinggi")
	val demamTinggi: Int,

	@field:SerializedName("panas_saat_buang_air_kecil")
	val panasSaatBuangAirKecil: Int,

	@field:SerializedName("berhubungan_diluar_nikah")
	val berhubunganDiluarNikah: Int,

	@field:SerializedName("menggaruk")
	val menggaruk: Int,

	@field:SerializedName("menstruasi_yang_tidak_normal")
	val menstruasiYangTidakNormal: Int,

	@field:SerializedName("luka_merah_di_sekitar_hidung")
	val lukaMerahDiSekitarHidung: Int,

	@field:SerializedName("sesak_napas")
	val sesakNapas: Int,

	@field:SerializedName("penglihatan_kabur_dan_terdistorsi")
	val penglihatanKaburDanTerdistorsi: Int,

	@field:SerializedName("ketidaknyamanan_kandung_kemih")
	val ketidaknyamananKandungKemih: Int,

	@field:SerializedName("nyeri_perut")
	val nyeriPerut: Int,

	@field:SerializedName("kehilangan_penciuman")
	val kehilanganPenciuman: Int,

	@field:SerializedName("otot_mengecil")
	val ototMengecil: Int,

	@field:SerializedName("pembengkakan_sendi")
	val pembengkakanSendi: Int,

	@field:SerializedName("bibir_kering_dan_kesemutan")
	val bibirKeringDanKesemutan: Int,

	@field:SerializedName("nyeri_dada")
	val nyeriDada: Int,

	@field:SerializedName("nyeri_di_daerah_anus")
	val nyeriDiDaerahAnus: Int,

	@field:SerializedName("gangguan_pencernaan")
	val gangguanPencernaan: Int,

	@field:SerializedName("tidak_enak_badan")
	val tidakEnakBadan: Int,

	@field:SerializedName("perubahan_sensorium")
	val perubahanSensorium: Int,

	@field:SerializedName("dahak")
	val dahak: Int,

	@field:SerializedName("gatal")
	val gatal: Int,

	@field:SerializedName("nyeri_sendi_panggul")
	val nyeriSendiPanggul: Int,

	@field:SerializedName("gatal_internal")
	val gatalInternal: Int,

	@field:SerializedName("komedo")
	val komedo: Int,

	@field:SerializedName("iritasi_di_anus")
	val iritasiDiAnus: Int,

	@field:SerializedName("bau_busuk_dari_urine")
	val bauBusukDariUrine: Int,

	@field:SerializedName("penurunan_berat_badan")
	val penurunanBeratBadan: Int,

	@field:SerializedName("sembelit")
	val sembelit: Int,

	@field:SerializedName("jantung_berdebar")
	val jantungBerdebar: Int,

	@field:SerializedName("kaku_saat_ingin_bergerak")
	val kakuSaatInginBergerak: Int,

	@field:SerializedName("menerima_suntikan_yang_tidak_steril")
	val menerimaSuntikanYangTidakSteril: Int,

	@field:SerializedName("menggigil")
	val menggigil: Int,

	@field:SerializedName("sakit_punggung")
	val sakitPunggung: Int,

	@field:SerializedName("bekas_luka_berair")
	val bekasLukaBerair: Int,

	@field:SerializedName("perut_kembung")
	val perutKembung: Int,

	@field:SerializedName("otot_melemah")
	val ototMelemah: Int,

	@field:SerializedName("tekanan_sinus")
	val tekananSinus: Int,

	@field:SerializedName("kelelahan")
	val kelelahan: Int,

	@field:SerializedName("mengeluarkan_gas")
	val mengeluarkanGas: Int,

	@field:SerializedName("nyeri_otot")
	val nyeriOtot: Int,

	@field:SerializedName("sariawan")
	val sariawan: Int,

	@field:SerializedName("demam_tifoid")
	val demamTifoid: Int,

	@field:SerializedName("peningkatan_nafsu_makan")
	val peningkatanNafsuMakan: Int,

	@field:SerializedName("ingin_buang_air_kecil_terus")
	val inginBuangAirKecilTerus: Int,

	@field:SerializedName("kehilangan_keseimbangan")
	val kehilanganKeseimbangan: Int,

	@field:SerializedName("kenaikan_berat_badan")
	val kenaikanBeratBadan: Int,

	@field:SerializedName("nyeri_sendi")
	val nyeriSendi: Int,

	@field:SerializedName("obesity")
	val obesity: Int,

	@field:SerializedName("air_kencing_berlebih")
	val airKencingBerlebih: Int,

	@field:SerializedName("tinja_berdarah")
	val tinjaBerdarah: Int,

	@field:SerializedName("bagian_sakit_perut")
	val bagianSakitPerut: Int,

	@field:SerializedName("kulit_melepuh")
	val kulitMelepuh: Int,

	@field:SerializedName("menguningnya_mata")
	val menguningnyaMata: Int,

	@field:SerializedName("bintik_bintik_merah_di_seluruh_tubuh")
	val bintikBintikMerahDiSeluruhTubuh: Int,

	@field:SerializedName("pembuluh_darah_bengkak")
	val pembuluhDarahBengkak: Int,

	@field:SerializedName("jerawat_bernanah")
	val jerawatBernanah: Int,

	@field:SerializedName("goyah")
	val goyah: Int,

	@field:SerializedName("pengelupasan_kulit")
	val pengelupasanKulit: Int,

	@field:SerializedName("bersin_bersin")
	val bersinBersin: Int,

	@field:SerializedName("mata_cekung")
	val mataCekung: Int,

	@field:SerializedName("dahak_mukoid")
	val dahakMukoid: Int,

	@field:SerializedName("anxiety")
	val anxiety: Int,

	@field:SerializedName("muntah")
	val muntah: Int,

	@field:SerializedName("kulit_bersisik")
	val kulitBersisik: Int,

	@field:SerializedName("pendarahan_perut")
	val pendarahanPerut: Int,

	@field:SerializedName("berkeringat")
	val berkeringat: Int,

	@field:SerializedName("nyeri_dibelakang_mata")
	val nyeriDibelakangMata: Int,

	@field:SerializedName("peradangan_kuku")
	val peradanganKuku: Int,

	@field:SerializedName("penyakit_keturunan")
	val penyakitKeturunan: Int,

	@field:SerializedName("kelebihan_cairan")
	val kelebihanCairan: Int,

	@field:SerializedName("nyeri_saat_berjalan")
	val nyeriSaatBerjalan: Int,

	@field:SerializedName("nyeri_saat_buang_air_besar")
	val nyeriSaatBuangAirBesar: Int,

	@field:SerializedName("tangan_dan_kaki_dingin")
	val tanganDanKakiDingin: Int,

	@field:SerializedName("gangguan_penglihatan")
	val gangguanPenglihatan: Int,

	@field:SerializedName("koma")
	val koma: Int,

	@field:SerializedName("kurangnya_konsentrasi")
	val kurangnyaKonsentrasi: Int,

	@field:SerializedName("pembesaran_tiroid")
	val pembesaranTiroid: Int,

	@field:SerializedName("riwayat_konsumsi_alkohol")
	val riwayatKonsumsiAlkohol: Int,

	@field:SerializedName("celah_kecil_pada_kuku")
	val celahKecilPadaKuku: Int,

	@field:SerializedName("bercak_di_tenggorokan")
	val bercakDiTenggorokan: Int,

	@field:SerializedName("pusing")
	val pusing: Int,

	@field:SerializedName("anggota_tubuh_melemah")
	val anggotaTubuhMelemah: Int,

	@field:SerializedName("nafsu_makan_hilang")
	val nafsuMakanHilang: Int,

	@field:SerializedName("satu_sisi_tubuh_melemah")
	val satuSisiTubuhMelemah: Int,

	@field:SerializedName("wajah_dan_mata_bengkak")
	val wajahDanMataBengkak: Int,

	@field:SerializedName("ruam_kulit")
	val ruamKulit: Int,

	@field:SerializedName("air_mata_berlebih")
	val airMataBerlebih: Int,

	@field:SerializedName("dehidrasi")
	val dehidrasi: Int,

	@field:SerializedName("sakit_kepala")
	val sakitKepala: Int,

	@field:SerializedName("mual")
	val mual: Int,

	@field:SerializedName("hidung_berair")
	val hidungBerair: Int,

	@field:SerializedName("kram")
	val kram: Int,

	@field:SerializedName("tidak_berenergi")
	val tidakBerenergi: Int,

	@field:SerializedName("demam_ringan")
	val demamRingan: Int,

	@field:SerializedName("varises")
	val varises: Int,

	@field:SerializedName("leher_kaku")
	val leherKaku: Int,

	@field:SerializedName("mudah_tersinggung")
	val mudahTersinggung: Int,

	@field:SerializedName("memar")
	val memar: Int,

	@field:SerializedName("rasa_lapar_berlebihan")
	val rasaLaparBerlebihan: Int,

	@field:SerializedName("asam_lambung")
	val asamLambung: Int,

	@field:SerializedName("urine_berwarna_gelap")
	val urineBerwarnaGelap: Int,

	@field:SerializedName("gagal_hati_akut")
	val gagalHatiAkut: Int,

	@field:SerializedName("depresi")
	val depresi: Int,

	@field:SerializedName("sensasi_berputar")
	val sensasiBerputar: Int,

	@field:SerializedName("batuk")
	val batuk: Int,

	@field:SerializedName("perubahan_warna_kulit_di_area_tertentu")
	val perubahanWarnaKulitDiAreaTertentu: Int,

	@field:SerializedName("kaki_bengkak")
	val kakiBengkak: Int
)
