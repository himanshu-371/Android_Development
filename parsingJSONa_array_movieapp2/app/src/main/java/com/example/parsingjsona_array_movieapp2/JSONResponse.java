package com.example.parsingjsona_array_movieapp2;

public class JSONResponse {


    public DataModel[] getMoviz() {
        return moviz;
    }

    public void setMoviz(DataModel[] moviz) {
        this.moviz = moviz;
    }

    public JSONResponse(DataModel[] moviz) {

        this.moviz = moviz;
    }

    DataModel[] moviz;


}
