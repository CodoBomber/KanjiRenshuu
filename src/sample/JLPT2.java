package sample;

public class JLPT2 implements JLPTFactory{

    String[] gKunYumi = new String[] {
            "えら(い)",
            "ちが(う)/ちが(える)",
            " ",
            "するど(い)",
            "こ(える)/こ(す)",
            "けむり/けむ(る)/けむ(い)",
            "きたな(い)/けが(す)/よご(す)/けが(らわしい)",
            " ",
            "お(す)/お(し)/おさ(える)/おし",
            "おく",
            " ",
            "くつ",
            " ",
            "みな",
            "くら(べる)",
            "かわ(く)/かわ(かす)",
            "あま(い)/あま(える)/あま(やかす)",
            "あせ",
            "わ",
            "ふく(む)/ふく(める)",
            "いの(る)",
            " ",
            "つ(める)/つ(まる)/つ(む)",
            " ",
            "おん",
            "おそ(れる)/おそ(ろしい)",
            "さけ(ぶ)",
            " ",
            "せま(い)/せば(める)/せば(まる)",
            "はさ(む)/はさ(まる)",
            " ",
            "すみ",
            "ほ(る)",
            "かたむ(く)/かたむ(ける)",
            "めぐ(む)/めぐみ",
            "むか(える)",
            "のき",
            "かた",
            "かしこ(い)",
            "か(れる)/か(らす)",
            "やと(う)",
            "たが(い)",
            "か/かお(り)/かお(る)",
            "さら/ふ(ける)",
            " ",
            "あら(い)/あ(れる)/あ(らす)",
            "かた(い)",
            " ",
            "こ(む)/こ(める)",
            " ",
            " ",
            "さ(く)",
            "さ(す)/さ(さる)/とげ",
            "うかが(う)",
            "あぶら",
            "しめ(る)/しめ(す)",
            "ふね/ふな",
            "やわ(らかい)/やわ(らか)",
            "のぼ(る)",
            "とこ/ゆか",
            "め(す)",
            " ",
            "たたみ/たた(む)",
            "さわ(る)/ふ(れる)",
            "から(い)",
            "の(びる)/の(ばす)/の(べる)",
            "ふる(う)/ふる(える)",
            "ね(る)/ね(かす)",
            "ふ(く)",
            " ",
            "し(める)/うらな(う)",
            "さが(す)",
            "は(く)",
            "ふた",
            " ",
            "にく(い)/にく(らしい)/にく(しみ)",
            "おく(る)",
            "か(える)/か(わる)",
            "ふくろ",
            " ",
            "おそ(い)/おく(らす)/おく(れる)",
            "はじ/は(じる)(じらう)/は(ずかしい)",
            " ",
            " ",
            "こ(える)/こ(す)",
            "めずら(しい)",
            "しず(む)/しず(める)",
            "どろ",
            "しず(く)/したた(る)",
            "との/どの",
            "ぬ(る)/ぬ(り)",
            " ",
            "わた(る)/わた(す)",
            "おこ(る)/いか(る)",
            " ",
            " ",
            "ぬす(む)",
            "つつ",
            "こお(る)/こご(える)",
            "に(げる)(がす)/のが(す)/のが(れる)",
            "たお(れる)/たお(す)",
            "つ(く)",
            "くも(る)",
            "にぶ(い)/にぶ(る)",
            "やわ(らかい)/やわ(らか)",
            "こ(い)",
            "なや(む)/なや(ます)",
            "さかずき",
            "と(まる)/と(める)",
            "うす(い)/うす(める)(まる)/うす(れる)(らぐ)",
            " ",
            "はだ",
            "かみ",
            "ぬ(く)/ぬ(ける)/ぬ(かす)/ぬ(かる)",
            " ",
            " ",
            "かの/かれ",
            "つか(れる)",
            "こうむ(る)",
            "ひき",
            "ねこ",
            "う(く)/う(かれる)/う(かぶ)/う(かべる)",
            "こわ(い)",
            " ",
            " ",
            " ",
            "ま(う)/まい",
            " ",
            "はば",
            "はら(う)",
            "わ(く)/わ(かす)",
            "かべ",
            "と(らえる)/と(らわれる)と(る)/つか(まる)/つか(まえる)",
            "つの(る)",
            "だ(く)/いだ(く)/かか(える)",
            " ",
            "いそが(しい)",
            " ",
            "みが(く)",
            "う(める)/う(まる)/う(もれる)",
            "ねむ(る)/ねむ(い)",
            "むすめ",
            "あた(える)",
            "と(ける)/と(かす)/と(く)",
            "こし",
            "おど(り)/おど(る)",
            "たの(む)/たの(もしい)/たよ(る)",
            "から(む)/から(まる)/から(める)",
            "つぶ",
            " ",
            " ",
            "すず(しい)/すず(む)",
            "なみだ",
            " ",
            " ",
            "もど(す)/もど(る)",
            "こ(う)/こい/こい(しい)",
            " ",
            "うで"
            };

    String[] gOnYumi = new String[] {
            "イ",
            "イ",
            "イ/エ",
            "エイ",
            "エツ",
            "エン",
            "オ",
            "オウ",
            "オウ",
            "オウ",
            "カ",
            "カ",
            "カイ",
            "カイ",
            "カク/コウ",
            "カン",
            "カン",
            "カン",
            "カン",
            "ガン",
            "キ",
            "キツ",
            "キツ",
            "キョ",
            "ギョ/ゴ",
            "キョウ",
            "キョウ",
            "キョウ",
            "キョウ",
            "キョウ",
            "グウ",
            "グウ",
            "クツ",
            "ケイ",
            "ケイ/エ",
            "ゲイ",
            "ケン",
            "ケン",
            "ケン",
            "コ",
            "コ",
            "ゴ",
            "コウ/キョウ",
            "コウ",
            "コウ",
            "コウ",
            "コウ",
            "コウ",
            " ",
            "コン",
            "サイ/セイ",
            " ",
            "シ",
            "シ",
            "シ",
            "シツ",
            "シュウ",
            "ジュウ/ニュウ",
            "ショウ",
            "ショウ",
            "ショウ",
            "ショウ",
            "ジョウ",
            "ショク",
            "シン",
            "シン",
            "シン",
            "シン",
            "スイ",
            "セイ/ショウ",
            "セン",
            "ソウ",
            "ソウ",
            "ソウ",
            "ソウ",
            "ゾウ",
            "ゾウ/ソウ",
            "タイ",
            "タイ",
            "タク",
            "チ",
            "チ",
            "チク",
            "チュウ",
            "チョウ",
            "チン",
            "チン",
            "デイ",
            "テキ",
            "デン",
            "ト",
            "ト",
            "ト",
            "ド",
            "トウ",
            "トウ",
            "トウ",
            "トウ",
            "トウ",
            "トウ",
            "トウ",
            "トツ",
            "ドン",
            "ドン",
            "ナン",
            "ノウ",
            "ノウ",
            "ハイ",
            "ハク",
            "ハク",
            "バク",
            "キ",
            "ハツ",
            "バツ",
            "ハン",
            "ハン",
            "ヒ",
            "ヒ",
            "ヒ",
            "ヒツ",
            "ビョウ",
            "フ",
            "フ",
            "フ",
            "フ",
            "フ",
            "ブ",
            "フウ/ホウ",
            "フク",
            "フツ",
            "フツ",
            "ヘキ",
            "ホ",
            "ボ",
            "ホウ",
            "ボウ",
            "ボウ",
            "ボウ/ボッ",
            "マ",
            "マイ",
            "ミン",
            "ジョウ/ロウ",
            "ヨ",
            "ヨウ",
            "ヨウ",
            "ヨウ",
            "ライ",
            "ラク",
            "リュウ",
            "リョウ",
            "リョウ",
            "リョウ",
            "ルイ",
            "レイ",
            "レイ",
            "レイ",
            "レン",
            "ワン",
            "ワン",
            };


    String[] gKanjiData = new String[] {
            "偉",
            "違",
            "依",
            "鋭",
            "越",
            "煙",
            "汚",
            "欧",
            "押",
            "奥",
            "菓",
            "靴",
            "介",
            "皆",
            "較",
            "乾",
            "甘",
            "汗",
            "環",
            "含",
            "祈",
            "喫",
            "詰",
            "巨",
            "御",
            "恐",
            "叫",
            "況",
            "狭",
            "挟",
            "偶",
            "隅",
            "掘",
            "傾",
            "恵",
            "迎",
            "軒",
            "肩",
            "賢",
            "枯",
            "雇",
            "互",
            "香",
            "更",
            "郊",
            "荒",
            "硬",
            "肯",
            "込",
            "婚",
            "歳",
            "咲",
            "刺",
            "伺",
            "脂",
            "湿",
            "舟",
            "柔",
            "昇",
            "床",
            "召",
            "紹",
            "畳",
            "触",
            "辛",
            "伸",
            "震",
            "寝",
            "吹",
            "姓",
            "占",
            "捜",
            "掃",
            "双",
            "燥",
            "憎",
            "贈",
            "替",
            "袋",
            "濯",
            "遅",
            "恥",
            "畜",
            "駐",
            "超",
            "珍",
            "沈",
            "泥",
            "滴",
            "殿",
            "塗",
            "途",
            "渡",
            "怒",
            "塔",
            "到",
            "盗",
            "筒",
            "凍",
            "逃",
            "倒",
            "突",
            "曇",
            "鈍",
            "軟",
            "濃",
            "悩",
            "杯",
            "泊",
            "薄",
            "爆",
            "肌",
            "髪",
            "抜",
            "般",
            "販",
            "彼",
            "疲",
            "被",
            "匹",
            "猫",
            "浮",
            "怖",
            "普",
            "膚",
            "符",
            "舞",
            "封",
            "幅",
            "払",
            "沸",
            "壁",
            "捕",
            "募",
            "抱",
            "帽",
            "忙",
            "坊",
            "磨",
            "埋",
            "眠",
            "娘",
            "与",
            "溶",
            "腰",
            "踊",
            "頼",
            "絡",
            "粒",
            "了",
            "療",
            "涼",
            "涙",
            "零",
            "齢",
            "戻",
            "恋",
            "湾",
            "腕"
            };


    String[] gEnglishData = new String[] {
            "great",
            "differ / violate",
            "depend on",
            "sharp",
            "go beyond",
            "smoke",
            "dirty",
            "Europe",
            "push / press",
            "inner part",
            "confectionery",
            "shoes",
            "mediate",
            "all",
            "compare",
            "dry",
            "sweet",
            "sweat",
            "ring",
            "contain",
            "pray",
            "inhale / drink",
            "reprimand / stuff",
            "huge",
            "honorific prefix",
            "fear",
            "shout",
            "conditions",
            "narrow",
            "hold between",
            "by chance / couple",
            "nook / corner",
            "dig",
            "incline",
            "favor",
            "welcome",
            "eaves",
            "shoulder",
            "wise",
            "wither",
            "employ",
            "reciprocal",
            "fragrance",
            "renew",
            "suburb",
            "wild",
            "hard",
            "assent",
            "into / be crowded",
            "marry",
            "year / age suffix",
            " ",
            "stab",
            "inquire",
            "fat",
            "damp",
            "small boat",
            "soft",
            "ascend",
            "bed / floor",
            "summon",
            "introduce",
            "tatami / fold up",
            "touch",
            "pungent / hard",
            "stretch",
            "quake",
            "go to sleep",
            "blow",
            "surname",
            "occupy / divine",
            "look for",
            "sweep",
            "set of two",
            "dry up",
            "hate",
            "present a gift",
            "replace",
            "bag/ sack",
            "rinse",
            "slow/ late",
            "shame",
            "livestock",
            "stationed",
            "surpass",
            "rare",
            "sink",
            "mud",
            "drop",
            "palace/ lord",
            "apply on a surface",
            "way",
            "cross",
            "get angry",
            "tower",
            "arrive",
            "steal",
            "tube",
            "freeze",
            "escape",
            "topple",
            "dash/ thrust",
            "cloudy",
            "dull",
            "soft",
            "thick",
            "suffer",
            "cup",
            "stay overnight",
            "thin",
            "explode",
            "skin",
            "hair",
            "pull out/ stand out",
            "sort",
            "sell",
            "he/ that",
            "tired",
            "be subject to",
            "comparable",
            "cat",
            "float",
            "fearful",
            "widespread",
            "skin",
            "symbol",
            "dance",
            "seal",
            "width",
            "clear away/ pay",
            "boil",
            "wall",
            "catch",
            "raise",
            "hug",
            "headgear",
            "busy",
            "boy/ priest",
            "polish",
            "bury",
            "sleep",
            "daughter/ girl",
            "give",
            "dissolve/ melt",
            "waist",
            "dance",
            "rely on/ ask",
            "entwice",
            "grain",
            "finish/ comprehend",
            "treat",
            "cool",
            "tear",
            "zero",
            "age",
            "return",
            "love",
            "bay",
            "arm"
            };


    String[] gExampleKanji = new String[] {
            "偉大",
            "違法",
            "依存",
            "鋭利",
            "越冬",
            "煙突",
            "汚染",
            "欧州",
            "押収",
            "山奥",
            "製菓",
            "靴下",
            "介護",
            "皆無",
            "比較",
            "乾燥",
            "甘味料",
            "冷や汗",
            "循環",
            "含有量",
            "祈願",
            "喫煙",
            "詰問",
            "巨額",
            " ",
            "恐怖",
            "絶叫",
            "不況",
            "狭き門",
            "挟む",
            "偶数",
            "片隅",
            "発掘",
            "傾向",
            "恩恵",
            "歓迎",
            "軒並み",
            " ",
            "賢明",
            "枯渇",
            "雇用",
            "互角",
            "香水",
            "更新",
            "近郊",
            "荒廃",
            "硬貨",
            "肯定",
            "駆け込む",
            "婚約",
            "歳月",
            " ",
            "刺激",
            "伺う",
            "脂肪",
            "湿度",
            " ",
            "柔道",
            "昇進",
            "起床",
            "召集",
            "自己紹介",
            "畳み",
            "感触",
            "香辛料",
            "伸縮",
            "震動",
            "寝室",
            "吹く",
            "姓名",
            "独占",
            "捜査",
            "清掃",
            "双眼鏡",
            "乾燥",
            "憎悪",
            "贈答",
            "代替",
            "紙袋",
            "洗濯物",
            "遅刻",
            "恥ずかしい",
            "畜産",
            "駐車場",
            "超過",
            "珍味",
            "沈没",
            "泥流",
            "水滴",
            "宮殿",
            "塗料",
            "途上国",
            "渡米",
            "喜怒哀楽",
            "五重ノ塔",
            "到達",
            "盗難",
            "封筒",
            "冷凍",
            "逃走",
            "倒産",
            "突然",
            "曇天",
            "鈍感",
            "軟弱",
            "濃厚",
            "苦悩",
            "祝杯",
            "外泊",
            "薄情",
            "爆弾",
            "肌荒れ",
            "長髪",
            "奇抜",
            "一般",
            "販売",
            "彼岸",
            "疲労",
            "被害",
            "匹敵",
            "猫舌",
            "浮力",
            "恐怖",
            "普及",
            "皮膚",
            "符号",
            "舞台",
            "封書",
            "幅跳び",
            "支払う",
            "沸点",
            "壁画",
            "捕獲",
            "募集",
            "抱負",
            "帽子",
            "多忙",
            "坊主",
            "磨く",
            "埋葬",
            "睡眠",
            "箱入リ娘",
            "与党",
            "溶液",
            "腰痛",
            "舞踊",
            "信頼",
            "連絡",
            "粒子",
            "了解",
            "療養",
            "納涼",
            "涙",
            "零下",
            "高齢",
            "払い戻し",
            "恋愛",
            "湾岸",
            "腕力"
            };

    String[] gExampleReading = new String[] {
            "イダイ",
            "イホウ",
            "イゾン",
            "エイリ",
            "エットウ",
            "エントツ",
            "オセン",
            "オウシュウ",
            "オウシュウ",
            "ヤマオク",
            "セイカ",
            "クツシタ",
            "カイゴ",
            "カイム",
            "ヒカク",
            "カンソウ",
            "カンミリョウ",
            "ヒヤアセ",
            "ジュンカン",
            "ガンユウリョウ",
            "キガン",
            "キツエン",
            "キツモン",
            "キョガク",
            " ",
            "キョウフ",
            "ゼッキョウ",
            "フキョウ",
            "セマキモン",
            "ハサム",
            "グウスウ",
            "カタスミ",
            "ハックツ",
            "ケイコウ",
            "オンケイ",
            "カンゲイ",
            "ノキナミ",
            " ",
            "ケンメイ",
            "コカツ",
            "コヨウ",
            "ゴカク",
            "コウスイ",
            "コウシン",
            "キンコウ",
            "コウハイ",
            "コウカ",
            "コウテイ",
            "カケコム",
            "コンヤク",
            "サイゲツ",
            " ",
            "シゲキ",
            "ウカガウ",
            "シボウ",
            "シツド",
            " ",
            "ジュウドウ",
            "ショウシン",
            "キショウ",
            "ショウシュウ",
            "ジコショウカイ",
            "タタミ",
            "カンショク",
            "コウシンリョウ",
            "シンシュク",
            "シンドウ",
            "シンシツ",
            "フク",
            "セイメイ",
            "ドクセン",
            "ソウサ",
            "セイソウ",
            "ソウガンキョウ",
            "カンソウ",
            "ゾウオ",
            "ゾウトウ",
            "ダイタイ",
            "カミブクロ",
            "センタクモノ",
            "チコク",
            "ハズカシイ",
            "チクサン",
            "チュウシャジョウ",
            "チョウカ",
            "チンミ",
            "チンボツ",
            "デイリュウ",
            "スイテキ",
            "キュウデン",
            "トリョウ",
            "トジョウコク",
            "トベイ",
            "キドアイラク",
            "ゴジュウノトウ",
            "トウタツ",
            "トウナン",
            "フウトウ",
            "レイトウ",
            "トウソウ",
            "トウサン",
            "トツゼン",
            "ドンテン",
            "ドンカン",
            "ナンジャク",
            "ノウコウ",
            "クノウ",
            "シュクハイ",
            "ガイハク",
            "ハクジョウ",
            "バクダン",
            "ハダアレ",
            "チョウハツ",
            "キバツ",
            "イッパン",
            "ハンバイ",
            "ヒガン",
            "ヒロウ",
            "ヒガイ",
            "ヒッテキ",
            "ネコジタ",
            "フリョク",
            "キョウフ",
            "フキュウ",
            "ヒフ",
            "フゴウ",
            "ブタイ",
            "フウショ",
            "ハバトビ",
            "シハラウ",
            "フッテン",
            "ヘキガ",
            "ホカク",
            "ボシュウ",
            "ホウフ",
            "ボウシ",
            "タボウ",
            "ボウズ",
            "ミガク",
            "マイソウ",
            "スイミン",
            "ハコイリムスメ",
            "ヨトウ",
            "ヨウエキ",
            "ヨウツウ",
            "ブヨウ",
            "シンライ",
            "レンラク",
            "リュウシ",
            "リョウカイ",
            "リョウヨウ",
            "ノウリョウ",
            "ナミダ",
            "レイカ",
            "コウレイ",
            "ハライモドシ",
            "レンアイ",
            "ワンガン",
            "ワンリョク"
            };


    String[] gExampleEnglish = new String[] {
            "greatness/",
            "illegal/ illegality/ unlawfulness/",
            "dependence/ dependent/ reliance/",
            "sharpness/",
            "passing the winter/",
            "chimney/",
            "pollution/ contamination/",
            "Europe/",
            "seizure/ confiscation/",
            "mountain recesses/",
            "confectionery/",
            "socks/",
            "nursing/",
            "nothing/",
            "comparison/",
            "dry/ arid/ insipid/ dehydrated/",
            "sweeteners/ sweetening materials/",
            "cold sweat/",
            "circulation/ rotation/ cycle/",
            "content(of a mineral/ etc.)/",
            "prayer/",
            "smoking/",
            "cross-examination/",
            "great sum/",
            " ",
            "be afraid/ dread/ dismay/ terror/",
            "exclamation/ scream/ shout/",
            "recession/ depression/ slump/",
            "narrow gate/ obstacle/ school(position)hard to enter(get)/",
            "to interpose/ to hold between/ to insert/",
            "even number/",
            "corner/ nook/",
            "(1)excavation/ exhumation/(2)discovery(e.g. new talent)/",
            "tendency/ trend/ inclination/",
            "grace/ favor/ blessing/ benefit/",
            "welcome/ reception/",
            "row of houses/",
            " ",
            "wisdom/ intelligence/ prudence/",
            "drying up/ becoming exhausted/ running dry/",
            "employment(long term)/ hire/",
            "equality/ evenness/ par/ good match/",
            "perfume/",
            "renewal/ update/ innovation/ renovation/",
            "suburbs/ outskirts/",
            "ruin/",
            "coin/",
            "positive/ affirmation/",
            "to rush in(at the last minute)/ to stampede/",
            "engagement/ betrothal/",
            "time/ years/",
            " ",
            "stimulus/ impetus/ incentive/ excitement/ irritation/ encouragement/ motivation/",
            "(hon)to visit/ to ask/ to inquire/ to hear/ to be told/ to implore(a god for an oracle)/",
            "fat/ grease/ blubber/",
            "level of humidity/",
            " ",
            "judo/",
            "promotion/",
            "rising/ getting out of bed/",
            "calling together(e.g. parliament)/",
            "self-introduction/",
            "4 1/ 2 Tatami mats/",
            "sense of touch/ feeling/ sensation/",
            "spices/",
            "expansion and contraction/ elasticity/ flexibility/",
            "shock/ tremor/ impact/",
            "bedroom/",
            "(1) to blow (wind, etc)/ (2) to emit/ to spout/",
            "full name/",
            "monopoly/",
            "search(esp. in criminal investigations)/ investigation/",
            "cleaning/",
            "binoculars/ field glasses/",
            " dry/ arid/ insipid/ dehydrated/",
            "hatred/",
            "exchange of presents/",
            "change of ownership/ substitution/ subrogation/",
            "paper bag/",
            "clothes to be washed/",
            "lateness/ late coming/",
            "shy/ ashamed/ embarrassed/",
            "animal husbandry/",
            "parking lot/ parking place/",
            "excess/ being more than/",
            "delicacy/",
            "sinking/ foundering/",
            "(volcanic)mud flow/",
            "drop of water/",
            "palace/",
            "paints/ painting material/",
            "developing country/",
            "going to U.S.A./",
            "human emotions(joy/ anger/ pathos/ and humor)/",
            "five-storied pagoda/",
            "reaching/ attaining/ arrival/",
            "theft/ robbery/",
            "envelope/",
            "freezing/ cold storage/ refrigeration/",
            "flight/ desertion/ escape/",
            "(corporate)bankruptcy/ insolvency/",
            "abruptly/ suddenly/ unexpectedly/ all at once/",
            "dull(cloudy)weather/",
            "thickheadedness/ stolidity/",
            "weakness/",
            "density/ richness/ concentration/ tension/",
            "suffering/ distress/ affliction/ anguish/ agony/ trouble/",
            "toast/ congratulatory cup/",
            "spending night away from home/",
            "unfeeling/ heartless/ cold-hearted/ cruel/",
            "bomb/",
            "dry skin/ bad skin/ rough skin/",
            "long hair/",
            "novel/ original/ striking/ strange/ eccentric/ fantastic/",
            "general/ liberal/ universal/ ordinary/ average/",
            "sale/ selling/ marketing/",
            "equinoctial week(when Buddhist services are held)/",
            "fatigue/ weariness/",
            "damage/",
            "comparing with/ match/ rival/ equal/",
            "unable to take(thermally)hot food/",
            "buoyancy/ floating power/",
            "be afraid/ dread/ dismay/ terror/",
            "diffusion/ spread/",
            "skin/",
            "sign/ mark/ symbol/",
            "(1)stage(theatre)/(2)scene or setting(e.g. of novel/ play/ etc.)/",
            "sealed letter/",
            "long jump/ broad jump/",
            "to pay/",
            "boiling point/",
            "fresco/ mural/ wall painting/",
            "capture/ seizure/",
            "recruiting/ taking applications/",
            "aspiration/ ambition/ pretension/",
            "hat/",
            "busy/ pressure of work/",
            "Buddhist priest/ bonze/",
            "to polish/ to shine/ to brush/ to refine/ to improve/",
            "burial/",
            "sleep/",
            "girl who has led a sheltered life/",
            "government party/(ruling)party in power/ government/",
            "solution(liquid)/",
            "pain in the hip/ lumbago/",
            "dancing/ dance/",
            "reliance/ trust/ confidence/",
            "junction/ communication/ contact/ connection/ coordination/",
            "particle/ grain/",
            "comprehension/ consent/ understanding/ roger(on the radio)/",
            "recuperation/ medical treatment/",
            "(enjoying the)cool of the evening/",
            "tear/",
            "below zero/ sub-zero/",
            "advanced(old)age/",
            "repayment/ refundment/",
            "love/ love-making/ passion/ emotion/ affections/",
            "gulf(bay)coast/",
            "physical strength/ brute strength/ arm strength/"
            };



    int[] gKanjiType = new int[] {
            12,
            13,
            8,
            15,
            12,
            13,
            6,
            8,
            8,
            12,
            11,
            13,
            4,
            9,
            13,
            11,
            5,
            6,
            17,
            7,
            8,
            12,
            13,
            5,
            12,
            10,
            6,
            8,
            9,
            9,
            11,
            12,
            11,
            13,
            10,
            7,
            10,
            8,
            16,
            9,
            12,
            4,
            9,
            7,
            9,
            9,
            12,
            8,
            5,
            11,
            13,
            9,
            8,
            7,
            10,
            12,
            4,
            9,
            8,
            7,
            5,
            11,
            12,
            13,
            7,
            7,
            15,
            13,
            7,
            8,
            5,
            9,
            11,
            4,
            17,
            14,
            18,
            12,
            11,
            17,
            12,
            10,
            10,
            15,
            12,
            9,
            7,
            8,
            14,
            13,
            13,
            10,
            12,
            9,
            12,
            8,
            11,
            12,
            10,
            9,
            10,
            8,
            16,
            12,
            11,
            16,
            10,
            8,
            8,
            16,
            18,
            6,
            14,
            7,
            10,
            11,
            8,
            10,
            10,
            4,
            11,
            10,
            8,
            12,
            15,
            11,
            15,
            9,
            12,
            5,
            8,
            16,
            10,
            12,
            8,
            12,
            6,
            7,
            16,
            10,
            10,
            10,
            3,
            13,
            13,
            14,
            16,
            12,
            11,
            2,
            17,
            11,
            10,
            12,
            17,
            7,
            10,
            12,
            12
            };

    @Override
    public int getLevel() {
        return 2;
    }

    @Override
    public int getQuantity() {
        return 159;
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
