package net.scriptsource.stringservice.sqlQueries;

public class SQL_Queries {
    private static String queryOrders = "SELECT " +
            "tbl_orders.orders_id," +
            "orders_date," +
            "customers_lastname," +
            "customers_firstname," +
            "mainstrings.strings_name AS 'mainstring'," +
            "tbl_orders_main.orders_main_tension AS 'maintension'," +
            "crossstrings.strings_name AS 'crossstring'," +
            "tbl_orders_cross.orders_cross_tension AS 'crosstension'," +
            "racket.racket_name," +
            "racketbrand.brand_name AS 'racketbrand'" +
            " FROM " +
            "tbl_orders" +
            " INNER JOIN " +
            " tbl_orders_cross" +
            " ON " +
            "tbl_orders.orders_id = tbl_orders_cross.orders_id" +
            " INNER JOIN " +
            "tbl_orders_main" +
            " ON " +
            "tbl_orders.orders_id = tbl_orders_main.orders_id" +
            " INNER JOIN " +
            "tbl_customers" +
            " ON " +
            "tbl_orders.customer_id = tbl_customers.customers_id" +
            " INNER JOIN " +
            "tbl_strings mainstrings" +
            " ON " +
            "tbl_orders_main.string_main_id = mainstrings.strings_id" +
            " INNER JOIN " +
            "tbl_strings crossstrings" +
            " ON " +
            "tbl_orders_cross.string_cross_id = crossstrings.strings_id" +
            " INNER JOIN " +
            "tbl_racket racket" +
            " ON " +
            "tbl_orders.racket_id = racket.racket_id" +
            " INNER JOIN " +
            "tbl_brand racketbrand" +
            " ON " +
            "racket.brand_id = racketbrand.brand_id;;";

    public String getOrder(){
        return queryOrders;
    }
}
