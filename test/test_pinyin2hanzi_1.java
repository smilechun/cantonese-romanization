import org.cghio.cantonese.romanization.Pinyin2Hanzi;
import static org.junit.Assert.assertEquals;

public class test_pinyin2hanzi_1 {

  private static String p2h(String pinyin) {
    int[] hanzi = Pinyin2Hanzi.fromPinyin(pinyin);
    return new String(hanzi, 0, hanzi.length);
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    assertEquals("丫亚亞吖呀哑啊啞氩氬錒锕阿鴉鸦", p2h("a"));
    assertEquals("哎唉嗌嗳噯埃挨隘", p2h("aai"));
    assertEquals("俺晏", p2h("aan"));
    assertEquals("罂罌", p2h("aang"));
    assertEquals("鴨鸭", p2h("aap"));
    assertEquals("压壓押", p2h("aat"));
    assertEquals("拗", p2h("aau"));
    assertEquals("厄扼握齷龌", p2h("ak"));
    assertEquals("暗諳谙黯", p2h("am"));
    assertEquals("莺鶯", p2h("ang"));
    assertEquals("呕嘔欧歐殴毆沤漚鷗鸥", p2h("au"));
    assertEquals("叭吧坝壩巴把爸疤笆粑罢罷芭葩鈀钯霸靶", p2h("ba"));
    assertEquals("呗唄拜摆擺敗湃稗败", p2h("baai"));
    assertEquals("伯佰卜帛白百迫", p2h("baak"));
    assertEquals("办坂扮斑板爿版班舨辦阪頒颁", p2h("baan"));
    assertEquals("繃绷蹦", p2h("baang"));
    assertEquals("八捌", p2h("baat"));
    assertEquals("包爆胞苞飽饱鮑鲍齙龅", p2h("baau"));
    assertEquals("币幣弊敝斃毙蓖蔽閉闭陛", p2h("bai"));
    assertEquals("北", p2h("bak"));
    assertEquals("乓泵", p2h("bam"));
    assertEquals("傧儐品奔嫔嬪宾彬摈擯斌殡殯滨濱禀稟笨膑臏賓錛鑌锛镔", p2h("ban"));
    assertEquals("嘣崩", p2h("bang"));
    assertEquals("不哔嗶弼拔毕畢笔筆跋钚", p2h("bat"));
    assertEquals("啤", p2h("be"));
    assertEquals("俾備匕卑吡备妣庇彼悲惫憊比毖毗泌畀痹痺碑秘罴羆脾臂被轡辔避鼻", p2h("bei"));
    assertEquals("柄疖疝疠疣疬疰疱疳疸痂痃痄病痍痖痤痦痧痫痱痼痿瘃瘅瘊瘐瘕瘗瘘瘙瘛瘞瘠瘢瘥瘭瘰瘳瘵瘼瘾瘿癀癃癇癉癍癔癘癜癞癤癩癭癮癯皰餅饼", p2h("beng"));
    assertEquals("壁璧碧襞逼", p2h("bik"));
    assertEquals("便匾卞变扁汴窆變貶贬辨辩辫辮辯边邊鞭", p2h("bin"));
    assertEquals("丙並兵冰并炳秉迸", p2h("bing"));
    assertEquals("別别必憋瘪癟鉍铋鱉鳖", p2h("bit"));
    assertEquals("婊彪标標表錶鏢鑣镖镳", p2h("biu"));
    assertEquals("佈保哺埔堡報宝寶布怖报捕暴曝步煲簿补補褒部鴇鸨", p2h("bo"));
    assertEquals("啵坡播波玻菠鄱", p2h("boh"));
    assertEquals("博搏泊箔縛缚膊舶薄鉑铂陛雹駁驳", p2h("bok"));
    assertEquals("帮幫梆榜磅綁绑邦鎊镑", p2h("bong"));
    assertEquals("杯焙狈狽背貝貰貲貺貽賁賅賕賚賧贄贐贝贲贳贶贻贽赀赅赆赇赉赍赕輩辈鋇钡", p2h("booi"));
    assertEquals("伴半叛搬本畔絆绊胖般苯", p2h("boon"));
    assertEquals("勃孛悖拨撥渤砵缽脖钵", p2h("boot"));
    assertEquals("仆僕卜卟瀑釙钋", p2h("buk"));
    assertEquals("甭", p2h("bung"));
    assertEquals("叉喳岔差挝搽撾查茬茶詫诧镲齄", p2h("cha"));
    assertEquals("侪儕柴猜豺踩釵钗", p2h("chaai"));
    assertEquals("冊册恻惻拆测測策賊贼", p2h("chaak"));
    assertEquals("参參惨惭慘慚掺搀摻攙杉蚕蠶讒谗饞馋黪黲", p2h("chaam"));
    assertEquals("产残殘灿燦產粲鏟铲餐", p2h("chaan"));
    assertEquals("撐撑橙", p2h("chaang"));
    assertEquals("插", p2h("chaap"));
    assertEquals("刷唰嚓察擦獭獺", p2h("chaat"));
    assertEquals("吵巢抄炒耖鈔钞", p2h("chaau"));
    assertEquals("傺凄哜嚌妻栖棲淒砌萋齊齐", p2h("chai"));
    assertEquals("侵吣寝寢寻尋沁沉浔潯讖谶鱘鲟", p2h("cham"));
    assertEquals("亲哂塵尘畛疹矧衬襯親診诊趁陈陳齔龀", p2h("chan"));
    assertEquals("层層曾", p2h("chang"));
    assertEquals("緝缉輯辑", p2h("chap"));
    assertEquals("七柒漆", p2h("chat"));
    assertEquals("丑俦儔凑嗅囚抽泅湊畴疇瞅秋稠筹籌糗綢绸臭踌躊酬醜鍬锹", p2h("chau"));
    assertEquals("且哆奢扯斜車軎軔軛軫軹軺輅輇輊輒輜輞輟輳轆轢轤车轫轭轱轳轵轷轸轹轺轾辁辂辄辋辍辎辏辘邪", p2h("che"));
    assertEquals("呎尺", p2h("chek"));
    assertEquals("請请", p2h("cheng"));
    assertEquals("倬勺卓妁戳桌灼綽绰芍", p2h("cheuk"));
    assertEquals("倡呛唱嗆场場墙娼戕抢搶昌暢枪槍牆猖畅祥窗翔肠腸蔷薔詳详長长", p2h("cheung"));
    assertEquals("似侈刺匙厕呲咫哧啻嗤始姒帜幟廁弛恃恥慈持柿次此池炽熾瓷疵痴矢磁祠糍翅耻脐臍茨蚩詞词賜赐踟辞辭迟遲雉雌馳驰齒齿", p2h("chi"));
    assertEquals("叱嘁戚敕斥赤", p2h("chik"));
    assertEquals("佥僉僭堑塹暹潛潜签簽鋟锓", p2h("chim"));
    assertEquals("仟前千扦歼殲浅溅濺纏纖纤缠迁遷錢钎钱闡阐阡顫颤", p2h("chin"));
    assertEquals("呈情惩懲拯晴氰清澄瞪秤称程稱蜻請请逞青", p2h("ching"));
    assertEquals("妾", p2h("chip"));
    assertEquals("切彻徹撤沏澈設设轍辙", p2h("chit"));
    assertEquals("俏峭悄昭朝潮瞧礁肖超迢釗钊", p2h("chiu"));
    assertEquals("嘈噪徂措操曹槽殂澡燥粗糙臊艚草躁醋", p2h("cho"));
    assertEquals("刍初挫搓楚矬础磋礎芻銼鋤錯锄锉错雏雛", p2h("choh"));
    assertEquals("塞彩才採材栽睬菜蔡裁財賽财赛采", p2h("choi"));
    assertEquals("仓伧倉傖创創厂床廠敞沧滄疮瘡舱艙苍蒼藏闖闯", p2h("chong"));
    assertEquals("伫佇储儲厨处廚曙柱橱櫥署處貯贮蹰躇躕", p2h("chue"));
    assertEquals("串传傳全喘存寸川拴揣村栓氚汆泉湍痊穿窜竄荃蹿躥醛釧銓钏铨镩", p2h("chuen"));
    assertEquals("咄啜嘬拙掇撮綴缀茁", p2h("chuet"));
    assertEquals("催取吹啐娶崔徐捶摧滁炊翠脆趋趣趨錘锤除隋随隨", p2h("chui"));
    assertEquals("亍促搐束畜矗蓄速齪龊", p2h("chuk"));
    assertEquals("巡循旬春椿秦蠢", p2h("chun"));
    assertEquals("丛从充冢冲匆叢囪囱塚宠寵從松沖筝箏聪聰葱蔥虫虮虺虻虼虿蚋蚍蚝蚧蚨蚰蚴蚵蚶蚺蛄蛉蛎蛏蛐蛑蛘蛞蛩蛭蛱蛲蛳蛴蛸蛺蜃蜇蜉蜊蜍蜞蜣蜩蜮蜱蜷蜾蜿蝈蝓蝣蝤蝥蝮蝰蝻蝼蝽蝾螄螅螈螋螓螗螨螫螬螭螯螵螻螽蟈蟊蟒蟓蟛蟠蟣蟥蟪蟯蟶蟾蠆蠊蠐蠑蠓蠔蠖蠛蠡蠣蠷蠹蠼衷重銃铳鬆", p2h("chung"));
    assertEquals("出黜黢", p2h("chut"));
    assertEquals("打", p2h("da"));
    assertEquals("呆大带帶戴歹", p2h("daai"));
    assertEquals("儋啖担擔氮淡耽聃胆膽", p2h("daam"));
    assertEquals("丹但单單弹彈惮憚掸撣旦蛋誕诞郸鄲鉭钽靼", p2h("daan"));
    assertEquals("搭沓瘩答踏", p2h("daap"));
    assertEquals("嗒挞撻笪达達鞑韃", p2h("daat"));
    assertEquals("低帝底弟抵氐第羝递逮遞隶隸", p2h("dai"));
    assertEquals("得德特锝", p2h("dak"));
    assertEquals("凳噔戥灯燈登等蹬邓鄧鐙镫", p2h("dang"));
    assertEquals("凸突", p2h("dat"));
    assertEquals("兜抖斗痘窦竇糾纠蚪豆逗鈄钭陡鬥", p2h("dau"));
    assertEquals("嗲爹", p2h("de"));
    assertEquals("地", p2h("dei"));
    assertEquals("笛籴糴", p2h("dek"));
    assertEquals("疔盯釘钉", p2h("deng"));
    assertEquals("朵", p2h("deuh"));
    assertEquals("啄琢", p2h("deuk"));
    assertEquals("嘀嫡敌敵涤滌滴狄的迪鏑镝", p2h("dik"));
    assertEquals("店掂点點", p2h("dim"));
    assertEquals("典垫墊奠巅巔殿淀澱电甸癫癲碘鈿钿電靛顛颠", p2h("din"));
    assertEquals("丁仃叮定洼窪耵訂订酊錠锭頂顶鼎", p2h("ding"));
    assertEquals("叠喋牒疊碟蝶諜谍", p2h("dip"));
    assertEquals("瓞秩跌軼轶迭", p2h("dit"));
    assertEquals("丟丢凋刁叼吊掉碉調调貂釣銩钓铞铥雕", p2h("diu"));
    assertEquals("倒刀到嘟堵妒导導岛島度悼捣搗杜氘渡盗盜睹稻賭赌道都鍍镀", p2h("do"));
    assertEquals("剁哚垛堕墮多惰朵跺躲", p2h("doh"));
    assertEquals("代岱待袋黛", p2h("doi"));
    assertEquals("踱鐸铎", p2h("dok"));
    assertEquals("党当挡擋档檔當盪荡鐺铛黨", p2h("dong"));
    assertEquals("断斷段短端緞缎鍛锻", p2h("duen"));
    assertEquals("夺奪", p2h("duet"));
    assertEquals("兌兑堆对對队隊", p2h("dui"));
    assertEquals("毒牍牘犊犢独獨督笃篤讀读黩黷", p2h("duk"));
    assertEquals("吨噸墩敦遁鈍钝頓顿", p2h("dun"));
    assertEquals("东侗冬冻凍动動咚幢恫懂東栋棟氡洞董", p2h("dung"));
    assertEquals("化花", p2h("fa"));
    assertEquals("傀哙噲块塊快筷", p2h("faai"));
    assertEquals("凡反帆梵樊泛烦煩犯瓣畈番矾礬範繁翻范蕃藩販贩返釩钒飯饭", p2h("faan"));
    assertEquals("发法珐琺發髟髡髦髫髭髮髯髹髻鬈鬏鬓鬟鬢", p2h("faat"));
    assertEquals("吠废廢徽挥揮晖暉沸肺費费輝辉镄", p2h("fai"));
    assertEquals("份偾僨分吩坟墳奋奮婚忿愤憤昏氛汾焚熏粉粪糞紛纷芬荤葷薰訓训酚鼢", p2h("fan"));
    assertEquals("乏伐佛唿弗忽拂氟祓筏罚罰艴閥阀", p2h("fat"));
    assertEquals("剖否埠浮涪缶罘阜", p2h("fau"));
    assertEquals("啡", p2h("fe"));
    assertEquals("匪妃扉斐淝翡肥腓菲蜚誹诽霏非飛飞", p2h("fei"));
    assertEquals("伙火炀炖炜炝炫炱炷炻烀烊烨焐焓焖焯焱煅煊煒煜煨煬煳煸煺熘熠熳燁燉燔燜燠燧燹爝爨科蝌課课貨货鈥钬", p2h("foh"));
    assertEquals("攫霍", p2h("fok"));
    assertEquals("仿况坊妨幌彷恍慌房放方旃旄旆旌旒晃枋況紡纺肓肪舫芳荒訪謊访谎鈁钫防", p2h("fong"));
    assertEquals("乎付俘俯傅刳副呋呼咐唬夫妇婦孚孵富库府庫戽扶抚撫敷斧枯父甫符肤腐腑膚芙苦苻虎裤褲訃讣負賦賻负赋赙赴輔辅釜附駙驸骷", p2h("foo"));
    assertEquals("喙喹奎恢悔晦灰詼誨诙诲魁", p2h("fooi"));
    assertEquals("宽寬欢款歡", p2h("foon"));
    assertEquals("闊阔", p2h("foot"));
    assertEquals("伏匐复幅復服福腹蝠袱複覆輻辐馥", p2h("fuk"));
    assertEquals("丰俸冯凤唪奉封峰枫楓烽疯瘋縫缝蜂諷讽豐逢鋒锋風颮颼飆风飑飕飙飚馮鳳", p2h("fung"));
    assertEquals("价假價加嘉嘎噶嫁家架枷稼袈賈贾鎵镓駕驾", p2h("ga"));
    assertEquals("介佳偕喈尬屆届戒界疥皆秸芥街解誡诫阶階", p2h("gaai"));
    assertEquals("嗝格胳膈鎘镉隔革鞒鞔鞣鞫鞯鞲鞴韉骼鬲", p2h("gaak"));
    assertEquals("减尴尷減监監鉴鑒鑫", p2h("gaam"));
    assertEquals("奸拣捡揀撿柬涧澗硷碱简簡繭艰艱茧諫谏锏間间鹼", p2h("gaan"));
    assertEquals("耕", p2h("gaang"));
    assertEquals("夹夾甲胛荚莢鉀鋏钾铗頰颊", p2h("gaap"));
    assertEquals("交佼搅搞攪教狡皎窖絞绞胶膠蛟跤較较郊鉸铰餃饺", p2h("gaau"));
    assertEquals("偈繼继蓟薊計计雞鸡", p2h("gai"));
    assertEquals("今咁噤感敢柑甘禁緘缄金鈐鈑鈽鉅銎銮鋃鋈鋝鋯錆錈錟錦錸錾鍇鍤鍪鍰鎏鏇鏊鏌鏜鏝鏨鐋鐓鐔鐾鑾钜钣钤钸铘铴铼锆锊锍锒锖锦锩锪锬锴锸锾镆镗镘镟镡镦", p2h("gam"));
    assertEquals("仅僅哏堇巾帏帑帔帙帱帻帼幃幔幗幘幛幞幡幬彷斤根筋紧緊艮謹谨跟近靳", p2h("gan"));
    assertEquals("哽庚更梗粳羹耿館馆", p2h("gang"));
    assertEquals("急蛤鴿鸽", p2h("gap"));
    assertEquals("佶吉桔疙", p2h("gat"));
    assertEquals("久九厩咎垢够夠廄抠摳救旧灸犰犴犷犸狁狃狍狎狒狗狨狯狲狳狴狷狺狻猁猃猊猓猕猗猝猞猡猥猬猱猸猹猻獍獐獗獠獪獫獬獯獷獼獾玀玖疚究舊苟韭鼽", p2h("gau"));
    assertEquals("伎几剞叽嘰基妓姬寄己幾忌技既机杞機畿箕紀纪羁羈肌記譏讥记飢饥麂", p2h("gei"));
    assertEquals("鏡镜頸颈驚", p2h("geng"));
    assertEquals("脚腳", p2h("geuk"));
    assertEquals("僵姜疆糨羌", p2h("geung"));
    assertEquals("亟击戟擊极棘極殛激", p2h("gik"));
    assertEquals("俭儉兼剑劍检檢", p2h("gim"));
    assertEquals("件健坚堅建捷肩腱見覘覡覦覬覯覲覷覿见觇觊觋觌觎觏觐觑鍵键", p2h("gin"));
    assertEquals("京儆兢刭剄劲勁境径徑惊敬景痉痙矜竞竟競經经茎荆荊莖警驚", p2h("ging"));
    assertEquals("劫", p2h("gip"));
    assertEquals("傑杰桀洁潔結结", p2h("git"));
    assertEquals("叫娇嬌敫矫矯繳缴驕骄", p2h("giu"));
    assertEquals("告皋睪睾稿窑窯篙糕羔膏誥诰鎬镐高", p2h("go"));
    assertEquals("个個哥歌", p2h("goh"));
    assertEquals("改該该", p2h("goi"));
    assertEquals("各搁擱斛玨珏覺觉角觖觚觜觞觥觫觯觴觶閣阁", p2h("gok"));
    assertEquals("乾干幹杆桿秆稈竿肝赶趕", p2h("gon"));
    assertEquals("冈刚剛岗岡崗扛杠槓江港綱纲缸罡耩肛講讲鋼钢降", p2h("gong"));
    assertEquals("估古咕固姑孤故沽罟股菇蛊蠱辜鈷錮钴锢雇顧顾鴣鸪鼓", p2h("goo"));
    assertEquals("倌冠官斡棺灌管罐莞觀观貫贯館馆鸛鹳", p2h("goon"));
    assertEquals("割葛褐", p2h("got"));
    assertEquals("倦券勋勛卷娟捐涓眷絹绢鵑鹃", p2h("guen"));
    assertEquals("举倨具句妪嫗居巨惧懼据據炬矩窭窶舉踞鋸锯颶飓", p2h("gui"));
    assertEquals("喾嚳局焗菊谷鋦锔鞠", p2h("guk"));
    assertEquals("供公共功宫宮工巩弓恭拱攻蚣貢贛贡赣躬鞏龔龚", p2h("gung"));
    assertEquals("剐剮卦呱寡挂掛瓜", p2h("gwa"));
    assertEquals("乖怪拐", p2h("gwaai"));
    assertEquals("关惯慣關", p2h("gwaan"));
    assertEquals("逛", p2h("gwaang"));
    assertEquals("刮括", p2h("gwaat"));
    assertEquals("刿劌匦匭匮匱圭季岿巋归悸柜桂櫃歸瑰皈硅詭诡貴贵跪軌轨閨闺饋馈鬼魃魇魈魉魍魎魑魘龜龟", p2h("gwai"));
    assertEquals("军君均棍滚滾筠衮袞軍郡鈞钧", p2h("gwan"));
    assertEquals("轟轰", p2h("gwang"));
    assertEquals("掘窟骨骰", p2h("gwat"));
    assertEquals("扃炯", p2h("gwing"));
    assertEquals("戈戗戛戡戢戤戧戩戬果棵裹过過錁锞顆颗", p2h("gwoh"));
    assertEquals("国國廓郭", p2h("gwok"));
    assertEquals("光广廣", p2h("gwong"));
    assertEquals("下厦哈夏廈暇瑕虾蝦遐鉿铪霞", p2h("ha"));
    assertEquals("孩懈揩械蟹諧谐邂鞋骸", p2h("haai"));
    assertEquals("吓嚇客", p2h("haak"));
    assertEquals("函咸喊涵衔銜餡馅", p2h("haam"));
    assertEquals("娴嫻閑閒闲限", p2h("haan"));
    assertEquals("坑夯行", p2h("haang"));
    assertEquals("呷嗑峡峽掐狭狹", p2h("haap"));
    assertEquals("吼哮姣孝巧拷效敲校烤考酵", p2h("haau"));
    assertEquals("係兮奚禊系繫鼷", p2h("hai"));
    assertEquals("克刻喀氪赫黑", p2h("hak"));
    assertEquals("勘含坎堪嵌憨憾撼砍酣陷頷颔", p2h("ham"));
    assertEquals("垦墾很恨恳懇狠痕", p2h("han"));
    assertEquals("亨哼啃幸恆恒杏肯行衡鏗铿", p2h("hang"));
    assertEquals("侠俠匣合洽盒禽耠頜颌", p2h("hap"));
    assertEquals("乞劾核瞎轄辖", p2h("hat"));
    assertEquals("侯候厚口后呙咣咴哌哒唼啶喉嗪嘧噠噼嚯後猴糇逅鱟鲎", p2h("hau"));
    assertEquals("僖唏喜嘻嘿器嬉岂希弃戏戲曦棄欺气氣汽烯熙熹牺犧禧羲豈起陷", p2h("hei"));
    assertEquals("吃", p2h("hek"));
    assertEquals("靴", p2h("heuh"));
    assertEquals("乡享向响晌鄉響餉饷香", p2h("heung"));
    assertEquals("欠欤欷欹歃歙歟謙谦险險", p2h("him"));
    assertEquals("宪憲掀显牵牽献獻祆纖纤蚬蜆衍譴谴軒轩遣锨顯", p2h("hin"));
    assertEquals("兄兴卿庆慶氢氫罄興輕轻馨", p2h("hing"));
    assertEquals("协協怯挟挾歉胁脅", p2h("hip"));
    assertEquals("歇", p2h("hit"));
    assertEquals("侥僥哓嘵嚣囂晓曉橇浇澆窍竅驍骁", p2h("hiu"));
    assertEquals("号嗥嚆嚎壕好昊毫浩皓耗號豪顥颢饕", p2h("ho"));
    assertEquals("何可呵嗬坷河舸荷菏賀贺", p2h("hoh"));
    assertEquals("亥凯凱剀剴嗨害开氦海鎧铠锎開頦颏駭骇", p2h("hoi"));
    assertEquals("壳学學殼鶴鹤", p2h("hok"));
    assertEquals("侃刊寒悍捍旱汉汗漢瀚焊看罕翰邯韓韩頇顸鼾", p2h("hon"));
    assertEquals("匡吭哐巷康慷杭眶筐糠腔航行降項頏项颃", p2h("hong"));
    assertEquals("喝渴", p2h("hot"));
    assertEquals("劝勸喧圈犬畎絢绚萱", p2h("huen"));
    assertEquals("血", p2h("huet"));
    assertEquals("去嘘噓墟栩煦翊虚虛許詡许诩", p2h("hui"));
    assertEquals("哭酷", p2h("huk"));
    assertEquals("倥兇凶匈哄孔恐控汞汹洪洶烘熊空紅红胸虹酗雄鴻鸿", p2h("hung"));
    assertEquals("乍吒咋咤咱揸榨渣炸碴蚱詐诈", p2h("ja"));
    assertEquals("债債寨斋齋", p2h("jaai"));
    assertEquals("啧嘖宅择掷摘擇擲泽澤窄翟舴謫谪責责", p2h("jaak"));
    assertEquals("崭嶄斩斬暂暫湛站糌蘸", p2h("jaam"));
    assertEquals("撰栈棧盏盞綻纂绽讚賺贊赚赞", p2h("jaan"));
    assertEquals("争挣掙爭狰猙睁睜", p2h("jaang"));
    assertEquals("习咂杂眨習袭襲閘闸集雜颯飒", p2h("jaap"));
    assertEquals("哳扎札紮軋轧", p2h("jaat"));
    assertEquals("嘲找抓爪罩肘驟骤", p2h("jaau"));
    assertEquals("仔制剂劑挤掣擠济滞滯濟祭製际際霁霽", p2h("jai"));
    assertEquals("仄侧側则則", p2h("jak"));
    assertEquals("怎斟枕浸譖谮針针鴆鸩", p2h("jam"));
    assertEquals("嗔圳振珍真賑赈鎮镇阵陣震", p2h("jan"));
    assertEquals("僧噌增峥崢憎曾筝箏罾贈赠蹭錚铮锃", p2h("jang"));
    assertEquals("執执汁", p2h("jap"));
    assertEquals("侄嫉疾窒質质", p2h("jat"));
    assertEquals("僦冑周咒啁啾奏宙就州帚揍揪昼晝洲皱皺紂纣胄舟舡舭舾袖謅诌走赳趄趑趔趱趲踺週邹鄒酎酏酐酒酡酤酯酰酲酴酹酽酾醅醌醍醐醑醢醪醭醮醯醴醵醺釃釅", p2h("jau"));
    assertEquals("借嗟姐榭者蔗謝谢这這遮鍺锗鷓鹧", p2h("je"));
    assertEquals("只唧炙脊隻", p2h("jek"));
    assertEquals("井净淨郑鄭阱", p2h("jeng"));
    assertEquals("嚼爵着禚著酌雀鵲鹊", p2h("jeuk"));
    assertEquals("丈仉仗伥倀像匠奖将將帐帳张張彰怅悵掌杖桨槳樟橡浆涨漲漳漿獎瘴章胀脹蒋蔣蟑象賬账酱醬鏘锵長长障", p2h("jeung"));
    assertEquals("之伺俟兹只吱咨嗣址姊姿子字孜寺巳志指挚摯支旨智枝止治淄滋痔知祀祉祗稚籽粢紙紫纸置耔耜肢脂自至致芝芷茲蜘誌諮谘資资趾錙锱飼饲齜龇", p2h("ji"));
    assertEquals("值即夕寂席植殖汐渍漬直矽积積穸籍績織织绩职職藉蛰蟄跡迹鯽鲫", p2h("jik"));
    assertEquals("佔占尖沾渐漸瞻砧粘詹譫谵贍赡", p2h("jim"));
    assertEquals("剪展戋戔战戰毡毯氈溅濺煎碾笺箋箭翦荐蔫薦賤贱践踐輾辗餞饯", p2h("jin"));
    assertEquals("侦偵帧幀征徵怔政整晶正症睛祯禎精蒸証證证貞贞鉦钲靖静靜", p2h("jing"));
    assertEquals("咻嗫囁接", p2h("jip"));
    assertEquals("哲截折捷浙睫節节蛰蟄", p2h("jit"));
    assertEquals("僬剿劁召噍招朝椒沼焦照蕉詔诏赵趙", p2h("jiu"));
    assertEquals("做唣早枣棗灶皂祖祚租糟組组藻蚤造遭", p2h("jo"));
    assertEquals("佐俎助唑坐左座阻", p2h("joh"));
    assertEquals("再哉在宰滓災灾甾載载", p2h("joi"));
    assertEquals("作凿昨柞鑿", p2h("jok"));
    assertEquals("壮壯妆妝庄撞桩樁状狀脏臟臧莊葬藏装裝贓赃", p2h("jong"));
    assertEquals("主住侏姝拄朱株注煮猪珠縱纵茱著蛀蛛註誅諸诛诸豬銖鑄铢铸駐驻麈", p2h("jue"));
    assertEquals("专传傳啭囀專尊攒攢砖磚蹲轉转遵鑽钻顓颛", p2h("juen"));
    assertEquals("啜嘬掇絕綴绝缀", p2h("juet"));
    assertEquals("叙咀嘴坠墜屿嶼序敘最椎沮狙疽罪聚蛆詛诅贅赘追醉錐锥雎齟龃", p2h("jui"));
    assertEquals("俗嗾嘱囑妯捉族浊濁烛燭瞩矚祝竹竺筑築簇粥續续舳触觸足趵趸趺趼趿跄跆跎跏跗跞跣跫跬跷跸跹跻跽踅踉踔踝踣踬踮踯踵踹踺踽蹀蹁蹂蹉蹊蹌蹑蹕蹙蹩蹯蹴蹶蹺蹼躅躉躋躏躐躑躓躔躚躜躞躡躦躪軸轴逐鏃鐲镞镯", p2h("juk"));
    assertEquals("笄笊笏笕笙笞笤笥笫笮笱笳笸笾筅筇筌筘筚筢筧筮筱筲筻箅箐箜箝箢箦箧箨箪箬箴箸篁篋篌篑篚篝篥篦篪篳篼簀簋簌簏簖簞簟簣簦簪簸籀籁籜籟籩籪", p2h("jukfa"));
    assertEquals("准尽峻晉晋枯樽津浚準濬烬燼盡窀竣臻进進鐫镌駿骏", p2h("jun"));
    assertEquals("中仲众偬傯宗忠总棕盅眾种種粽終綜縱總纵终综肿腫舂舯訟誦讼诵踪蹤重鍾鐘钟锺頌颂鬃", p2h("jung"));
    assertEquals("卒", p2h("jut"));
    assertEquals("佧卡咔咖", p2h("ka"));
    assertEquals("楷", p2h("kaai"));
    assertEquals("咭", p2h("kaat"));
    assertEquals("銬铐靠", p2h("kaau"));
    assertEquals("启啟契溪稽訖讫", p2h("kai"));
    assertEquals("噙妗擒琴禽衾襟", p2h("kam"));
    assertEquals("勤芹", p2h("kan"));
    assertEquals("及吸汲笈級給级给", p2h("kap"));
    assertEquals("咳", p2h("kat"));
    assertEquals("俅叩媾寇扣构構求沟溝球臼舅虬虯裘購购鳩鸠", p2h("kau"));
    assertEquals("伽瘸茄騎骑", p2h("ke"));
    assertEquals("企其冀奇岐崎旗期棋歧琪畸祁祈祺頎颀鰭鳍麒", p2h("kei"));
    assertEquals("剧劇", p2h("kek"));
    assertEquals("却卻噱", p2h("keuk"));
    assertEquals("強强羟羥鏹镪", p2h("keung"));
    assertEquals("鉗钳黔", p2h("kim"));
    assertEquals("虔", p2h("kin"));
    assertEquals("倾傾擎琼瓊頃顷鯨鲸黥", p2h("king"));
    assertEquals("孑揭撅竭羯蝎蠍頡颉黠", p2h("kit"));
    assertEquals("乔侨僑喬撬桥橋檄翘翹轎轿", p2h("kiu"));
    assertEquals("鈳钶", p2h("koh"));
    assertEquals("丐慨概溉盖瞌磕蓋鈣钙", p2h("koi"));
    assertEquals("壑榷涸确確郝", p2h("kok"));
    assertEquals("亢伉扩抗擴旷曠炕狂矿礦鈧钪", p2h("kong"));
    assertEquals("箍", p2h("koo"));
    assertEquals("侩儈刽劊溃潰烩燴繪绘聩聵脍膾賄贿", p2h("kooi"));
    assertEquals("括聒豁", p2h("koot"));
    assertEquals("拳权權豢顴颧", p2h("kuen"));
    assertEquals("决劂厥噘孓抉決炔缺訣譎诀谲镢", p2h("kuet"));
    assertEquals("佝佢俱区區岖嶇拒拘渠瞿祛衢袪距躯軀駒驅驱驹", p2h("kui"));
    long stopTime = System.currentTimeMillis();
    System.out.println("300 Pinyin-to-Hanzi tests were passed. Time used: " + (stopTime - startTime) + " ms.");
  }

}
