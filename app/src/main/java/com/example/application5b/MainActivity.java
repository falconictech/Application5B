package com.example.application5b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    String countryList[] = {"Afghanistan","Aland Islands","Albania","Algeria","American Samoa","Andorra","Angola","Anguilla","Antarctica","Antigua and Barbuda","Argentina","Armenia","Aruba","Ascension Island","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Basque Country","Belarus","Belgium","Belize","Benin","Bermuda","Bhutan","Bolivia","Bonaire, Sint Eustatius and Saba","Bosnia and Herzegovina","Botswana","Bouvet Island","Brazil","British Indian Ocean Territory","Brunei Darussalam","Bulgaria","Burkina Faso","Burundi","Cabo Verde","Cambodia","Cameroon","Canada","Canary Islands","Catalonia","Cayman Islands","Central African Republic","Central European Free Trade Agreement","Chad","Chile","China","Christmas Island","Clipperton Island","Cocos (Keeling) Islands","Colombia","Comoros","Cook Islands","Costa Rica","Croatia","Cuba","Curaçao","Cyprus","Czech Republic","Côte d'Ivoire","Democratic Republic of the Congo","Denmark","Diego Garcia","Djibouti","Dominica","Dominican Republic","East African Community","Ecuador","Egypt","El Salvador","England","Equatorial Guinea","Eritrea","Estonia","Eswatini","Ethiopia","Europe","Falkland Islands","Faroe Islands","Federated States of Micronesia","Fiji","Finland","France","French Guiana","French Polynesia","French Southern Territories","Gabon","Galicia","Gambia","Georgia","Germany","Ghana","Gibraltar","Greece","Greenland","Grenada","Guadeloupe","Guam","Guatemala","Guernsey","Guinea","Guinea-Bissau","Guyana","Haiti","Heard Island and McDonald Islands","Holy See","Honduras","Hong Kong","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Isle of Man","Israel","Italy","Jamaica","Japan","Jersey","Jordan","Kazakhstan","Kenya","Kiribati","Kosovo","Kuwait","Kyrgyzstan","Laos","Latvia","League of Arab States","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macau","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Martinique","Mauritania","Mauritius","Mayotte","Mexico","Moldova","Monaco","Mongolia","Montenegro","Montserrat","Morocco","Mozambique","Myanmar","Namibia","Nauru","Nepal","Netherlands","New Caledonia","New Zealand","Nicaragua","Niger","Nigeria","Niue","Norfolk Island","North Korea","North Macedonia","Northern Ireland","Northern Mariana Islands","Norway","Oman","Pakistan","Palau","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Pitcairn","Poland","Portugal","Puerto Rico","Qatar","Republic of the Congo","Romania","Russia","Rwanda","Réunion","Saint Barthélemy","Saint Helena, Ascension and Tristan da Cunha","Saint Kitts and Nevis","Saint Lucia","Saint Martin","Saint Pierre and Miquelon","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia","Scotland","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa","South Georgia and the South Sandwich Islands","South Korea","South Sudan","Spain","Sri Lanka","State of Palestine","Sudan","Suriname","Svalbard and Jan Mayen","Sweden","Switzerland","Syria","Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tokelau","Tonga","Trinidad and Tobago","Tristan da Cunha","Tunisia","Turkmenistan","Turks and Caicos Islands","Tuvalu","Türkiye","Uganda","Ukraine","United Arab Emirates","United Kingdom","United Nations","United States Minor Outlying Islands","United States of America","Unknown","Uruguay","Uzbekistan","Vanuatu","Venezuela","Vietnam","Virgin Islands (British)","Virgin Islands (U.S.)","Wales","Wallis and Futuna","Western Sahara","Yemen","Zambia","Zimbabwe"};
    int images[] = {R.drawable.af,R.drawable.ax,R.drawable.al,R.drawable.dz,R.drawable.as,R.drawable.ad,R.drawable.ao,R.drawable.ai,R.drawable.aq,R.drawable.ag,R.drawable.ar,R.drawable.am,R.drawable.aw,R.drawable.aw,R.drawable.au,R.drawable.at,R.drawable.az,R.drawable.bs,R.drawable.bh,R.drawable.bd,R.drawable.bb,R.drawable.es,R.drawable.by,R.drawable.be,R.drawable.bz,R.drawable.bj,R.drawable.bm,R.drawable.bt,R.drawable.bo,R.drawable.bq,R.drawable.ba,R.drawable.bw,R.drawable.bv,R.drawable.br,R.drawable.io,R.drawable.bn,R.drawable.bg,R.drawable.bf,R.drawable.bi,R.drawable.cv,R.drawable.kh,R.drawable.cm,R.drawable.ca,R.drawable.ic,R.drawable.es,R.drawable.ky,R.drawable.cf,R.drawable.cefta,R.drawable.td,R.drawable.cl,R.drawable.cn,R.drawable.cx,R.drawable.cp,R.drawable.cc,R.drawable.co,R.drawable.km,R.drawable.ck,R.drawable.cr,R.drawable.hr,R.drawable.cu,R.drawable.cw,R.drawable.cy,R.drawable.cz,R.drawable.ci,R.drawable.cd,R.drawable.dk,R.drawable.dg,R.drawable.dj,R.drawable.dm,R.drawable.resource_do,R.drawable.eac,R.drawable.ec,R.drawable.eg,R.drawable.sv,R.drawable.gb,R.drawable.gq,R.drawable.er,R.drawable.ee,R.drawable.sz,R.drawable.et,R.drawable.eu,R.drawable.fk,R.drawable.fo,R.drawable.fm,R.drawable.fj,R.drawable.fi,R.drawable.fr,R.drawable.gf,R.drawable.pf,R.drawable.tf,R.drawable.ga,R.drawable.es,R.drawable.gm,R.drawable.ge,R.drawable.de,R.drawable.gh,R.drawable.gi,R.drawable.gr,R.drawable.gl,R.drawable.gd,R.drawable.gp,R.drawable.gu,R.drawable.gt,R.drawable.gg,R.drawable.gn,R.drawable.gw,R.drawable.gy,R.drawable.ht,R.drawable.hm,R.drawable.va,R.drawable.hn,R.drawable.hk,R.drawable.hu,R.drawable.is,R.drawable.in,R.drawable.id,R.drawable.ir,R.drawable.iq,R.drawable.ie,R.drawable.im,R.drawable.il,R.drawable.it,R.drawable.jm,R.drawable.jp,R.drawable.je,R.drawable.jo,R.drawable.kz,R.drawable.ke,R.drawable.ki,R.drawable.xk,R.drawable.kw,R.drawable.kg,R.drawable.la,R.drawable.lv,R.drawable.arab,R.drawable.lb,R.drawable.ls,R.drawable.lr,R.drawable.ly,R.drawable.li,R.drawable.lt,R.drawable.lu,R.drawable.mo,R.drawable.mg,R.drawable.mw,R.drawable.my,R.drawable.mv,R.drawable.ml,R.drawable.mt,R.drawable.mh,R.drawable.mq,R.drawable.mr,R.drawable.mu,R.drawable.yt,R.drawable.mx,R.drawable.md,R.drawable.mc,R.drawable.mn,R.drawable.me,R.drawable.ms,R.drawable.ma,R.drawable.mz,R.drawable.mm,R.drawable.na,R.drawable.nr,R.drawable.np,R.drawable.nl,R.drawable.nc,R.drawable.nz,R.drawable.ni,R.drawable.ne,R.drawable.ng,R.drawable.nu,R.drawable.nf,R.drawable.kp,R.drawable.mk,R.drawable.gb,R.drawable.mp,R.drawable.no,R.drawable.om,R.drawable.pk,R.drawable.pw,R.drawable.pa,R.drawable.pg,R.drawable.py,R.drawable.pe,R.drawable.ph,R.drawable.pn,R.drawable.pl,R.drawable.pt,R.drawable.pr,R.drawable.qa,R.drawable.cg,R.drawable.ro,R.drawable.ru,R.drawable.rw,R.drawable.re,R.drawable.bl,R.drawable.sh,R.drawable.kn,R.drawable.lc,R.drawable.mf,R.drawable.pm,R.drawable.vc,R.drawable.ws,R.drawable.sm,R.drawable.st,R.drawable.sa,R.drawable.gb,R.drawable.sn,R.drawable.rs,R.drawable.sc,R.drawable.sl,R.drawable.sg,R.drawable.sx,R.drawable.sk,R.drawable.si,R.drawable.sb,R.drawable.so,R.drawable.za,R.drawable.gs,R.drawable.kr,R.drawable.ss,R.drawable.es,R.drawable.lk,R.drawable.ps,R.drawable.sd,R.drawable.sr,R.drawable.sj,R.drawable.se,R.drawable.ch,R.drawable.sy,R.drawable.tw,R.drawable.tj,R.drawable.tz,R.drawable.th,R.drawable.tl,R.drawable.tg,R.drawable.tk,R.drawable.to,R.drawable.tt,R.drawable.ta,R.drawable.tn,R.drawable.tm,R.drawable.tc,R.drawable.tv,R.drawable.tr,R.drawable.ug,R.drawable.ua,R.drawable.ae,R.drawable.gb,R.drawable.un,R.drawable.um,R.drawable.us,R.drawable.xx,R.drawable.uy,R.drawable.uz,R.drawable.vu,R.drawable.ve,R.drawable.vn,R.drawable.vg,R.drawable.vi,R.drawable.gb,R.drawable.wf,R.drawable.eh,R.drawable.ye,R.drawable.zm,R.drawable.zw};

    RecyclerView recyclerView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         recyclerView = findViewById(R.id.rv_RecyclerView);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

//        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        GridLayoutManager layoutManager = new GridLayoutManager(this,3,LinearLayoutManager.HORIZONTAL,false);


        recyclerView.setLayoutManager(layoutManager);


        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),countryList,images);


        recyclerView.setAdapter(customAdapter);





    }
}