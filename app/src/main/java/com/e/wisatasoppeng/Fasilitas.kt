package com.e.wisatasoppeng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fasilitas.*

class Fasilitas : AppCompatActivity() {

    private val imageList = arrayListOf(
    "https://4.bp.blogspot.com/-b9BQhZwHLVA/Wq9fIL87TiI/AAAAAAAAHik/Cd_5yg0brhokkAUN1fRwIz7IpAWVzFM7gCLcBGAs/s1600/a4e2db85-bc23-4310-a21b-cf4237345af0.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAP5A1Rc3-Cp05yCkWW-10RUVdt2G85PT-5KAZruoc1hYOS0OYvw&s.jpg",
        "https://2.bp.blogspot.com/-xqGVk-Hm-uQ/WiEsD2hKbRI/AAAAAAAAE8w/PBchjn6VG6E4AZwMo3uVskhapWuwv7iqQCLcBGAs/s1600/0c5585ab-f79c-45a7-ba67-307c696d78fe.jpg",
       "https://scontent-sjc3-1.cdninstagram.com/v/t51.2885-15/e35/37325553_243968293086074_1947755488208748544_n.jpg?_nc_ht=scontent-sjc3-1.cdninstagram.com&_nc_cat=102&_nc_ohc=dEBzQJkcvb8AX_sKz6-&oh=17eac5af996b8a5b354740d317c48f97&oe=5EDA693D&ig_cache_key=MTgzMDk3NjA5MDUwMTY5OTU4Mw%3D%3D.2.jpg",
        "https://scontent-sjc3-1.cdninstagram.com/v/t51.2885-15/e35/47586463_2309712085925903_3180318006241671955_n.jpg?_nc_ht=scontent-sjc3-1.cdninstagram.com&_nc_cat=111&_nc_ohc=YM9fRK5nbJoAX_SdZwv&oh=8d0ccbbd6df62db48f3a2e6253c5f69a&oe=5ED9B4ED&ig_cache_key=MTk1MjI4MzU2NzUyNDMzMTEwMg%3D%3D.2.jpg",
        "https://1.bp.blogspot.com/-9mIXfjRVyFU/XSwxqulGXII/AAAAAAAARRQ/Js2KPUzwgkwoLJINkpabkzr1Vcdiku9OwCLcBGAs/s1600/Hotel%2BAda%2BSoppeng.jpg",
        "https://lh3.googleusercontent.com/-OLLr7oCH4Aw/WnwFISVJTSI/AAAAAAAADK8/OM9_khyuhXcb57YjX9-1SdoT7dG-nW75wCLIBGAYYCw/w1080-h608-p-k-no-v0/.jpg",
        "https://soppengkab.go.id/wp-content/uploads/2017/07/14.jpg",
        "https://scontent-sjc3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/p750x750/61171818_2317942981827866_1546853360141449461_n.jpg?_nc_ht=scontent-sjc3-1.cdninstagram.com&_nc_cat=102&_nc_ohc=sEzo6KGZOn4AX-wQUwa&oh=2e571f48d043d9dff44da82957adda7b&oe=5EA10FFD&ig_cache_key=MjA2MzM3NTMyODg1MTcxNDczMQ%3D%3D.2.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fasilitas)
        val adapter= AdapterFasilitas(imageList)
        fasilitas.adapter=adapter
    }
}
