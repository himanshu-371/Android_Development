package com.example.parsingjsonfromnestedobject;

public class JSONResponse {

    DataModel[] moviz;

    public DataModel[] getMoviz() {
        return moviz;
    }


    public JSONResponse(DataModel[] moviz) {

        this.moviz = moviz;
    }

}
