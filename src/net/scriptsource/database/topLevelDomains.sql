SELECT
    a.top_level_domainID,
    b.geographical_name AS 'Geographical Name',
    c.top_level_domain
FROM
    top_level_domains_countries a
inner JOIN
    country_list b ON a.countryID = b.id
inner JOIN
    top_level_domains c ON a.top_level_domainID = c.id;