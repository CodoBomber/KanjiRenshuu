package sample;

public class JLPT5 implements JLPTFactory{

    String[] gOnYumi = new String[] {
            "アン",
            "イチ/イツ",
            "イン",
            "ウ/ユウ",
            "ウ",
            "エキ",
            "エン",
            "カ",
            "カ",
            "カ/ゲ",
            "カ",
            "カイ/エ",
            "ガイ/ゲ",
            "ガク",
            "カン/ケン",
            "キ",
            "キュウ/ク",
            "キュウ",
            "ギョ",
            "キン/コン",
            "クウ",
            "ゲツ",
            "ケン",
            "ゲン/ゴン",
            "コ",
            "ゴ",
            "ゴ/コウ",
            "ゴ",
            "ゴ",
            "コウ",
            "コウ",
            "コウ",
            "コウ",
            "コク",
            "コン",
            "サ",
            "サン",
            "サン",
            "シ",
            "シ",
            "ジ",
            "ジ",
            "シチ",
            "シャ",
            "シャ",
            "シュ",
            "シュウ",
            "ジュウ/ジッ",
            "シュツ/スイ",
            "ショ",
            "ジョ/ニョ/ニョウ",
            "ショウ",
            "ショウ",
            "ジョウ/ショウ",
            "ショク",
            "シン",
            "ジン/ニン",
            "スイ",
            "セイ/ショウ",
            "セイ",
            "セン",
            "セン",
            "セン",
            "ゼン",
            "ソク",
            "タ",
            "ダイ",
            "ダン",
            "チュウ/ジュウ",
            "チョウ",
            "テン",
            "テン",
            "デン",
            "ド",
            "トウ",
            "ドウ",
            "トク",
            "ナン",
            "ニ",
            "ニチ/ジツ",
            "ニュウ",
            "ネン",
            "バイ",
            "ハク",
            "ハチ",
            "ハン",
            "ヒャク",
            "フ",
            "ブン/フン/ブ",
            "ブン/モン",
            "ボ",
            "ホク",
            "ボク",
            "ホン",
            "マイ",
            "マン/バン",
            "メイ/ニョウ",
            "モク",
            "ユウ",
            "ライ",
            "リツ/リュウ",
            "ロク",
            "ワ"
            };


    String[] gKunYumi = new String[] {
            "やす(い)",
            "ひと(つ)",
            "の(む)",
            "みぎ",
            "あめ",
            " ",
            "まる(い)",
            "ひ/ほ",
            "はな",
            "した/しも/もと/くだ(る)/お(ろす)/さ(げる)",
            "なに/なし",
            "あ(う)",
            "そと/ほか/はず(す)",
            "まな(ぶ)",
            "あいだ/ま",
            "け",
            "ここの(つ)",
            "やす(む)",
            "さかな/うお",
            "かな/かね",
            "そら/から/あ(く)/あ(ける)",
            "げつ/つき",
            "けん/み(る)",
            "い(う)/こと",
            "ふる(い)/ふる(す)",
            "いつ/いつ(つ)",
            "のち/うし(ろ)/あと/おく(れる)",
            " ",
            "かた(る)/かた(らう)",
            " ",
            "くち",
            "い(く)/ゆ(く)/おこな(う)",
            "たか(い)/たか(める)/たか(まる)/たか",
            "くに",
            "いま",
            "ひだり",
            "み/みっ(つ)/み(つ)",
            "やま",
            "よ/よん/よっ(つ)/よ(つ)",
            "こ",
            "みみ",
            "とき",
            "なな/なな(つ)/なの",
            "くるま",
            "やしろ ",
            "て/た",
            " ",
            "とお/と",
            "で(る)/だ(す)",
            "か(く)",
            "おんな/め",
            "ちい(さい)/こ/お",
            "すく(ない)/すこ(し)",
            "うえ/うわ/かみ/あ(げる)/のぼ(る)",
            "た(べる)/く(らう)/く(う)",
            "あたら(しい)/あら(た)/にい",
            "ひと",
            "みず",
            "い(きる)/う(まれる)/お(う)/は(える)/き/なま",
            "にし",
            "かわ",
            "ち ",
            "さき",
            "まえ",
            "あし/た(りる)/た(る)/た(す)",
            "おお(い)",
            "おお/おお(きい)/おお(いに)",
            "おとこ",
            "なか",
            "なが(い)",
            "あめ/あま ",
            "みせ",
            " ",
            "つち",
            "ひがし",
            "みち",
            "よ(む)",
            "みなみ",
            "ふた/ふた(つ)",
            "ひ/か",
            "い(る)/い(れる)/はい(る)",
            "とし",
            "か(う)",
            "しろ/しろ(い)/しら",
            "や/やっ(つ)/よう",
            "なか(ば) ",
            " ",
            "ちち",
            "わ(ける)/わ(かれる)/わ(かる)/わ(かつ)",
            "き(く)/き(こえる)",
            "はは",
            "きた",
            "き/こ",
            "もと",
            " ",
            " ",
            "な",
            "め/ま",
            "とも",
            "く(る)/きた(る)/きた(す)",
            "た(つ)/た(てる)",
            "む/む(つ)/むっ(つ)/むい",
            "はな(す)/はなし"
            };


    String[] gKanjiData = new String[] {
            "安",
            "一",
            "飲",
            "右",
            "雨",
            "駅",
            "円",
            "火",
            "花",
            "下",
            "何",
            "会",
            "外",
            "学",
            "間",
            "気",
            "九",
            "休",
            "魚",
            "金",
            "空",
            "月",
            "見",
            "言",
            "古",
            "五",
            "後",
            "午",
            "語",
            "校",
            "口",
            "行",
            "高",
            "国",
            "今",
            "左",
            "三",
            "山",
            "四",
            "子",
            "耳",
            "時",
            "七",
            "車",
            "社",
            "手",
            "週",
            "十",
            "出",
            "書",
            "女",
            "小",
            "少",
            "上",
            "食",
            "新",
            "人",
            "水",
            "生",
            "西",
            "川",
            "千",
            "先",
            "前",
            "足",
            "多",
            "大",
            "男",
            "中",
            "長",
            "天",
            "店",
            "電",
            "土",
            "東",
            "道",
            "読",
            "南",
            "二",
            "日",
            "入",
            "年",
            "買",
            "白",
            "八",
            "半",
            "百",
            "父",
            "分",
            "聞",
            "母",
            "北",
            "木",
            "本",
            "毎",
            "万",
            "名",
            "目",
            "友",
            "来",
            "立",
            "六",
            "話"
            };



    String[] gEnglishData = new String[] {
            "peaceful / cheap",
            "one",
            "drink",
            "right",
            "rain",
            "station",
            "circle / yen",
            "fire",
            "flower",
            "down / under / lower",
            "what / how(many)",
            "meet / society",
            "outside",
            "study / learning",
            "interval / between",
            "gas /irit",
            "nine",
            "rest",
            "fish",
            "money / gold",
            "sky / air / empty",
            "moon / month",
            "see",
            "say /eech",
            "old",
            "five",
            "after",
            "noon",
            "language / word / tell",
            "school / collate",
            "mouth",
            "go / act / line",
            "high",
            "country / nation",
            "now / this",
            "left",
            "three",
            "mountain",
            "four",
            "tiny thing / child",
            "ear",
            "time",
            "seven",
            "vehicle / wheel",
            "company / society",
            "hand / person",
            "week",
            "ten",
            "go out / put out",
            "write / book",
            "woman",
            "small",
            "little",
            "up / above",
            "eat / food",
            "new",
            "human being",
            "water",
            "life / birth",
            "west",
            "river",
            "thousand",
            "ahead",
            "before / front",
            "foot/ suffice",
            "many",
            "big/ university",
            "man",
            "middle/ in",
            "long/ chief",
            "heaven",
            "shop",
            "electricity",
            "soil",
            "east",
            "way/ path",
            "read",
            "south",
            "two",
            "day/ sun",
            "enter/ put in",
            "year",
            "buy",
            "white",
            "eight",
            "half",
            "hundred",
            "father",
            "divide/ part/ minute",
            "hear",
            "mother",
            "north",
            "tree/ wood",
            "basis/ book/ this",
            "every",
            "ten thousand",
            "name",
            "eye/ item",
            "friend",
            "come",
            "stand/ establish",
            "six",
            "speak/ talk"
            };


    String[] gExampleKanji = new String[] {
            "安い",
            "一日",
            "飲食",
            "右手",
            "雨天",
            "駅前",
            "百円",
            "火ようび",
            "生け花",
            "　",
            "何日",
            "会社",
            "外出",
            "学校",
            "人間",
            "電気",
            "九日",
            "休日",
            "　",
            "お金",
            "空手",
            "毎月",
            "見学",
            "言語",
            "中古",
            "五日",
            "　",
            "正午",
            "語学",
            "高校",
            "　",
            "行く",
            "高い",
            "外国",
            "今年",
            "左手",
            "三本",
            "火山",
            "四十",
            "子ども",
            "耳",
            "時間",
            "七五三",
            "自どう車",
            "社会",
            "手紙",
            "一週間",
            "十分",
            "出口",
            "書店",
            "女子",
            "小学校",
            "少年",
            "上下",
            "食後",
            "新聞",
            "人生",
            "水分",
            "学生",
            " ",
            "川上",
            "千年",
            "先生",
            "午前中",
            "足",
            "多い",
            "大学",
            "男子",
            "中学",
            "長い",
            "天",
            "店",
            "電気",
            "土よう日",
            "東西",
            "水道",
            "読書",
            "南",
            "二日",
            "日よう日",
            "入学",
            "年間",
            "買う",
            " ",
            "八時",
            "半年",
            "百か店",
            "父",
            "水分",
            "聞く",
            "母",
            "北国",
            "木よう日",
            "日本",
            "毎日",
            "一万",
            "名前",
            "目",
            "友人",
            "外来語",
            "立つ",
            "六日",
            "会話"
            };



    String[] gExampleReading = new String[] {
            "ヤスイ",
            "イチニチ",
            "インショク",
            "ミギテ",
            "ウテン",
            "エキマエ",
            "ヒャクエン",
            "カヨウビ",
            "イケバナ",
            "　",
            "ナンニチ",
            "カイシャ",
            "ガイシュツ",
            "ガッコウ",
            "ニンゲン",
            "デンキ",
            "ココノカ",
            "キュウジツ",
            "　",
            "オカネ",
            "カラテ",
            "マイツキ",
            "ケンガク",
            "ゲンゴ",
            "チュウコ",
            "イツカ",
            "　",
            "ショウゴ",
            "ゴガク",
            "コウコウ",
            "　",
            "イク",
            "タカイ",
            "ガイコク",
            "コトシ",
            "ヒダリテ",
            "サンボン",
            "カザン",
            "ヨンジュウ",
            "コドモ",
            "ミミ",
            "ジカン",
            "シチゴサン",
            "ジドウシャ",
            "シャカイ",
            "テガミ",
            "イッシュウカン",
            "ジュウブン",
            "デグチ",
            "ショテン",
            "ジョシ",
            "ショウガッコウ",
            "ショウネン",
            "ジョウゲ",
            "ショクゴ",
            "シンブン",
            "ジンセイ",
            "スイブン",
            "ガクセイ",
            "　",
            "カワカミ",
            "センネン",
            "センセイ",
            "ゴゼンチュウ",
            "アシ",
            "オオイ",
            "ダイガク",
            "ダンシ",
            "チュウガク",
            "ナガイ",
            "テン",
            "ミセ/テン",
            "デンキ",
            "ドヨウビ",
            "トウザイ",
            "スイドウ",
            "ドクショ",
            "ミナミ",
            "フツカ",
            "ニチヨウビ",
            "ニュウガク",
            "ネンカン",
            "カウ",
            "　",
            "ハチジ",
            "ハントシ",
            "ヒャッカテン",
            "チチ",
            "スイブン",
            "キク",
            "ハハ",
            "キタグニ",
            "モクヨウビ",
            "ニホン/ニッポン",
            "マイニチ",
            "イチマン",
            "ナマエ",
            "メ",
            "ユウジン",
            "ガイライゴ",
            "タツ",
            "ムイカ",
            "カイワ"
            };


    String[] gExampleEnglish = new String[] {
            "cheap/ inexpensive/ peaceful/ quiet/ gossipy/ thoughtless/",
            "(1)one day/(2)first of month/",
            "food and drink/ eating and drinking/",
            "right hand/",
            "rainy weather/",
            "in front of station/",
            "100　yen",
            "Tuesday(abbr)/",
            "(1)flower arrangement/",
            " ",
            "what day/ how many days/",
            "company/ corporation/",
            "outing/ going out/",
            "school/",
            "human being/ man/ person/",
            "electricity/(electric)light/",
            "nine days/ the ninth day(of the month)/",
            "holiday/ day off/",
            "　",
            "money/",
            "karate/",
            "every month/ each month/ monthly/",
            "inspection/ study by observation/ field trip/",
            "language/",
            "(1)used/ second-hand/ old/(2)Middle Ages/",
            "five days/ the fifth day(of the month)/",
            "　",
            "noon/ mid-day/",
            "language study/",
            "senior high school/",
            "　",
            "to go/",
            "(1)high/ tall/(2)expensive/",
            "foreign country/",
            "this year/",
            "left hand/",
            "three(long cylindrical things)/",
            "volcano/",
            "forty/",
            "child// children/",
            "(1)ear/(2)hearing/(3)edge/ crust/",
            "time/",
            "(1)festival(shrine visit)by children aged 7/ 5 and 3/(2)lucky numbers 7/ 5 and 3/",
            "automobile/",
            "society/ public/",
            "letter/",
            "one week/",
            "(1)plenty/ enough/ sufficient/ satisfactory/ adequate/(2)division into ten/(3)perfect/ thorough/ fully/ in full/",
            "exit/ gateway/ way out/ outlet/ leak/ vent/",
            "bookshop/ bookstore/",
            "woman/ girl/",
            "primary school/ elementary school/",
            "boys/ juveniles/",
            "high and low/ up and down/ unloading and loading/ praising and blaming/",
            "after a meal/",
            "newspaper/",
            "(human)life(i.e. conception to death)/",
            "moisture/",
            "student/",
            "　",
            "upper reaches of a river/",
            "millennium/ one thousand years/",
            "teacher/ master/ doctor/",
            "this morning/ in the morning/ throughout the morning/",
            "foot/ pace/ gait/ leg/",
            "many/ numerous/",
            "university/",
            "youth/ young man/",
            "middle school/ junior high school/",
            "long/ lengthy/",
            "heaven/ sky/",
            "store/ shop/ establishment/",
            "electricity/(electric)light/",
            "Saturday/",
            "(1)East and West/(2)whole country/(3)Orient and Occident/(4)Your attention/ please!/",
            "water service/ water supply/",
            "reading/",
            "South/ proceeding south/",
            "second day of the month/ two days/",
            "Sunday/",
            "entry to school or university/ matriculation/",
            "year/",
            "to buy/",
            "　",
            "eight hours/",
            "half year/",
            "(department)store/",
            "(hum)father/",
            "moisture/",
            "to hear/ to listen/ to ask/",
            "(hum)mother/",
            "northern provinces/ northern countries/",
            "Thursday/",
            "Japan/",
            "every day/",
            "10,000/ ten thousand/ myriads/ all/ everything",
            "name/",
            "(1)eye/ eyeball/(2)ordinal number suffix/",
            "friend/",
            "borrowed word/ foreign origin word/",
            "to stand/",
            "six days/ sixth(day of month)/",
            "conversation/"
            };


    int[] gKanjiType = new int[] {
            6,
            1,
            12,
            5,
            8,
            14,
            4,
            4,
            7,
            3,
            7,
            6,
            5,
            8,
            12,
            6,
            2,
            6,
            11,
            8,
            8,
            4,
            7,
            7,
            5,
            4,
            9,
            4,
            14,
            10,
            3,
            6,
            10,
            8,
            4,
            5,
            3,
            3,
            5,
            3,
            6,
            10,
            2,
            7,
            7,
            4,
            11,
            2,
            5,
            10,
            3,
            3,
            4,
            3,
            9,
            13,
            2,
            4,
            5,
            6,
            3,
            3,
            6,
            9,
            7,
            6,
            3,
            7,
            4,
            8,
            4,
            8,
            13,
            3,
            8,
            12,
            14,
            9,
            2,
            4,
            2,
            6,
            12,
            5,
            2,
            5,
            6,
            4,
            4,
            14,
            5,
            5,
            4,
            5,
            6,
            3,
            6,
            5,
            4,
            7,
            5,
            4,
            13
            };

    @Override
    public int getLevel() {
        return 5;
    }

    @Override
    public int getQuantity() {
        return 103;
    }

    @Override
    public  String[] getgOnYumi() {
        return gOnYumi;
    }

    @Override
    public  String[] getgKunYumi() {
        return gKunYumi;
    }

    @Override
    public  String[] getgKanjiData() {
        return gKanjiData;
    }

    @Override
    public  String[] getgEnglishData() {
        return gEnglishData;
    }

    @Override
    public  String[] getgExampleKanji() {
        return gExampleKanji;
    }

    @Override
    public  String[] getgExampleReading() {
        return gExampleReading;
    }

    @Override
    public  String[] getgExampleEnglish() {
        return gExampleEnglish;
    }

    @Override
    public  int[] getgKanjiType() {
        return gKanjiType;
    }

}