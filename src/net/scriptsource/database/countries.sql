SELECT
       b.geographical_name AS 'Geographical Name',
       b.official_name AS 'Official Name',
       c.city_name AS 'Capital City',
       d.city_name AS 'Largest City',
       cd.country_area AS 'Country Area',
       cd.country_population AS 'Population',
       cd.country_prefix AS 'Prefix',
       e.country_iso AS 'Country ISO',
       c2.currency_iso AS 'Currency ISO',
       c2.currency_name AS 'Currency'
FROM
    countryCityDetailCodeCurrency AS a
inner join
        country_list b on a.countryId = b.id
inner join
        city_list c on a.capitalCityID = c.id
inner join
        city_list d on a.largestCityID = d.id
inner join
        country_details cd on a.countryDetailsID = cd.id
inner join
        country_codes e on a.countryCodeID = e.id
inner join
        currencies c2 on a.countryCurrencyID = c2.id
ORDER BY b.geographical_name ASC;