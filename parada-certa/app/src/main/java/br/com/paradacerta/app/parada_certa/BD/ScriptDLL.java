package com.example.erick.myapplication.BD;

/**
 * Created by Erick on 23/09/2017.
 */

public class ScriptDLL {

    public static String getCreateTableCoordenadas(){

        StringBuilder sql =  new StringBuilder();

        sql.append("CREATE TABLE    coordenadas (");
        sql.append("                idcoordenada  PRIMARY KEY NOT NULL,");
        sql.append("                latitude,");
        sql.append("                longitude,");
        sql.append("                idlinha");
        sql.append("    )  ");

        return sql.toString();
    }

    public static String getCreateTablelinhas() {

        StringBuilder sql =  new StringBuilder();

        sql.append("CREATE TABLE    linhas(");
        sql.append("                idlinha PRIMARY KEY NOT NULL,");
        sql.append("                nome,");
        sql.append("                codigo,");
        sql.append("                tipo");
        sql.append("    )  ");

        return sql.toString();
    }

    public static String getCreateTableparadalinha() {

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE    paradalinha (" );
        sql.append("                idlinha," );
        sql.append("                idparada" );
        sql.append("    )  " );

        return sql.toString();
    }

    public static String getCreateTableparadas() {

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE    paradas (" );
        sql.append("                id_parada  PRIMARY KEY NOT NULL," );
        sql.append("                codigo," );
        sql.append("                longitude," );
        sql.append("                latitude," );
        sql.append("                terminal" );
        sql.append("    )  " );

        return sql.toString();
    }
}
