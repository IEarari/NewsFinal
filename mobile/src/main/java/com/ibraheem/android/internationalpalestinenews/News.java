package com.ibraheem.android.internationalpalestinenews;


public class News {

    private final String mTitolo;
    private final String mselezionenome;
    private final String mdatapubblicata;
    private final String mUrl;
    private final String mAuthorName;

    public News(String Titolo, String selezionenome, String datapubblicata, String url , String Author) {
        this.mTitolo = Titolo;
        this.mselezionenome = selezionenome;
        this.mdatapubblicata = datapubblicata;
        this.mUrl = url;
        this.mAuthorName = Author;
    }

    public String getTitolo() {
        return mTitolo;
    }

    public String getselezionenome() {
        return mselezionenome;
    }

    public String getdatapubblicata() {
        return mdatapubblicata;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getAuthorName() {
        return mAuthorName;
    }
}
