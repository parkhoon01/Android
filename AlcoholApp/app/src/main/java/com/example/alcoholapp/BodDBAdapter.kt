package com.example.alcoholapp

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.sql.SQLException

class BodDBAdapter (private val mCtx: Context) {
    private lateinit var dbHelper: DatabaseHelper
    private lateinit var db: SQLiteDatabase

    private class DatabaseHelper(context: Context)
        : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
        override fun onCreate(p0: SQLiteDatabase?) {    // create
            p0!!.execSQL(TABLE_CREATE)
        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) { // 스키마 변경(alter, drop)
            p0!!.execSQL("DROP TABLE IF EXISTS " + SQLITE_TABLE)
            onCreate(p0)
        }

    }
    @kotlin.Throws(SQLException::class)
    fun open(): BodDBAdapter{
        dbHelper = DatabaseHelper(mCtx)
        db = dbHelper.writableDatabase  // 기록 용도로 DB에 접근
        return this
    }

    fun close(){
        if(dbHelper != null) dbHelper.close()
    }

    fun createCountry(code: String, name: String, continent: String, region: String): Long{
        val values = ContentValues()
        values.put(KEY_CODE, code)
        values.put(KEY_NAME, name)
        values.put(KEY_CONTINENT, continent)
        values.put(KEY_REGION, region)
        return db.insert(SQLITE_TABLE, null, values)
    }

    fun insertSomeCountries() {
        createCountry("SB" , "Scotch Blue", "Scotland", "롯데칠성음료에서 개발한 국내용 블렌디드 위스키 브랜드. 1997년 처음 출시되었다. 국산이라고 하지만 위스키 원액은 전부 스코틀랜드에서 수입해온다.")
        createCountry("JD", "Jack Daniels", "United States", "올해로 정확히 150주년이 된 잭 다니엘은 지난 1866년 재스퍼 뉴턴 잭 다니엘(1849~1911)이 테네시주 린치버그에 설립했다. ... 이후 잭 다니엘은 댄 콜로부터 특별한 위스키 레시피를 전수 받았으며, 그의 증류소를 인수해 내놓은 것이 바로 잭 다니엘이다.")
        createCountry("JW", "Johnnie Walker", "Scotland", "조니워커의 역사는 1820년에 존 워커가 창업한 식료품점에서부터시작되었습니다. ... 현재의 이름인 Johnnie Walker Whisky 조니워커 위스키로 이름을 변경하였습니다. 위스키 사업을 본격적으로 확장하면서 창업자인 할아버지의 이름을 붙인 것입니다.")
        createCountry("JB", "Jim Beam", "United States", "1795년, 짐 빔의 창립자인 요하네스 빔이 첫 번째 배럴을 개봉한 것에서 그 역사가 시작된다. 이후 금주법 시대에 그 명맥이 잠시 끊겼다가, 현재의 짐 빔의 모태가 된 제임스 B. 빔에 의해 1933년 켄터키주에 새 양조장을 열게 된다. 그 이후, 대표적인 미국의 버번 위스키 브랜드로 손꼽이는 곳이다. 이후 짐 빔의 외손자인 Booker Noe에게 넘어갔고, 짐 빔의 조카인 Earl Beam은 Heaven Hill 증류소에서 일하고 있다.")
        createCountry("CR", "Chivas Regal", "Scotland", "시바스리갈은 1801년 스코틀랜드 에버딘에서 시바스 형제가 설립한 회사의 제품이다. 리갈(regal)은 '제왕다운'이라는 뜻으로, 1843년 빅토리아 여왕을 위해 왕실에 납품하면서 '제왕의 시바스'라는 의미로 시바스 리갈이라는 이름을 붙였다고 한다.")
        createCountry("JM", "Jagermeister", "German", "1934년 독일의 마스트-예거마이스터(Mast-Jägermeister)사에서 개발된 전통 리큐르이다. 독일의 전통 리큐르로서 비터스의 일종인 크로이터리쾨르(Kräuterlikör)에서 유래되었다")
        createCountry("BL", "Ballentines", "Scotland", "발렌타인스 스카치 위스키의 역사는 1827년, 농부의 아들인 조지 발렌타인이 에딘버러에 세운 작은 식료품 가게를 1869년 그의 맏이인 아키발드(Archibald) 발렌타인과 차남인 조지 주니어(George Junior)와 함께 글래스고에서 상호를 '조지 발렌타인 앤드 선 (George Ballantine & Son)' 사로 하는, 영국 왕족에게 납품할 정도로 포도주와 주정 거래 사업을 확장시킨 것으로 시작되었다. ")
        createCountry("RS", "Royal Salute", "United Kingdom", "1953년 영국엘리자베스 2세 여왕의 대관식에 최소 21년 이상 숙성된 원액으로만 이루어진 로얄살루트 21년이 헌정되며 궁극의 럭셔리 위스키 브랜드 로얄살루트의 역사가 시작되었습니다.")
        createCountry("GB", "Golden Blue", "Republic of Korea", "위스키 본연의 풍부한 향과 맛을 가진 골든블루 2009년 한국인의 입맛에 맞는 최적의 부드러움을 찾기 위해 3년간의 연구를 통해 탄생한 국내 최초 36.5도 프리미엄 위스키 골든블루. 36.5도의 완벽한 부드러움과 위스키 본연의 풍부한 향과 맛을 가진 골든블루는 까다로운 소비자의 입맛을 충족시키며 국내 위스키 시장에서 일하게 성장세를 이어나가고 있습니다. 2015년 세계적인 권위를 자랑하는 3대 주류품평회 몽드 셀렉션(Monde-Selection)과 미국 샌프란시스코 국제주류품평회(SWSC) 위스키 부문, 국제 주류품평회(IWSC)에서 각각 금상과 은상을 수상하여 우수한 품질을 인정받았습니다.")
    }

    fun deleteAllCountries(): Boolean{
        // db.execSQL("delete from Country where code = ? and country = ?", arrayOf("LAX", ""))
        var result = db.delete(SQLITE_TABLE, null, null)
        return result > 0
    }

    @kotlin.Throws(SQLException::class)
    fun fetchCountriesByName(inputText: String?): Cursor? {
        var mCursor: Cursor? = if (inputText == null || inputText.length == 0) {  // 필터에 입력이 안된 경우
            db.query(SQLITE_TABLE, arrayOf(KEY_ROWID, KEY_CODE, KEY_NAME, KEY_CONTINENT, KEY_REGION),
                null, null, null, null, KEY_CODE)
        } else { // 필터에 값을 입력한 경우
            db.query(SQLITE_TABLE, arrayOf(KEY_ROWID, KEY_CODE, KEY_NAME, KEY_CONTINENT, KEY_REGION),
                KEY_NAME + " LIKE '%" + inputText + "%'", null, null, null, KEY_CODE)
        }
        mCursor?.moveToFirst()
        return mCursor
    }

    fun fetchAllCountries(): Cursor {
        var cursor: Cursor? = null
        val query = "select * from " + SQLITE_TABLE + " order by " + KEY_CODE
        cursor = db.rawQuery(query, null)
        return cursor
    }

    companion object {
        const val KEY_ROWID = "_id"
        const val KEY_CODE = "code"
        const val KEY_NAME = "name"
        const val KEY_CONTINENT = "continent"
        const val KEY_REGION = "region"
        private const val TAG = "CountriesDbAdapter"
        private const val DATABASE_NAME = "World"
        private const val SQLITE_TABLE = "Country"
        private const val DATABASE_VERSION = 2
        private const val TABLE_CREATE = "CREATE TABLE if not exists " + SQLITE_TABLE + " (" +
                KEY_ROWID + " integer PRIMARY KEY autoincrement," +
                KEY_CODE + "," +
                KEY_NAME + "," +
                KEY_CONTINENT + "," +
                KEY_REGION + "," +
                " UNIQUE (" + KEY_CODE + "));"
    }
}