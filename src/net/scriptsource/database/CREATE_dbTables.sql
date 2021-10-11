CREATE DATABASE gtc;
USE gtc;
drop table if exists city_list cascade;
drop table if exists currencies cascade;
drop table if exists top_level_domains cascade;
drop table if exists country_list cascade;
drop table if exists country_details cascade;
drop table if exists country_codes cascade;
drop table if exists top_level_domains_countries cascade;
drop table if exists countryCityDetailCodeCurrency cascade;
drop table if exists top_level_domains_countries cascade;

CREATE TABLE if not exists city_list
(
    id int auto_increment primary key,
    city_name varchar(50)
);
CREATE TABLE if not exists country_list
(
    id int auto_increment primary key,
    geographical_name varchar(50) not null,
    official_name varchar(150) not null
);
CREATE table if not exists currencies
(
    id int auto_increment primary key,
    currency_iso varchar(4) not null,
    currency_name varchar(50) not null
);
CREATE TABLE if not exists top_level_domains
(
    id int auto_increment primary key,
    top_level_domain varchar(10) not null
);
CREATE TABLE if not exists country_details
(
    id int auto_increment primary key,
    country_area double not null,
    country_population bigint not null,
    country_prefix varchar(7) not null
);
CREATE TABLE if not exists country_codes
(
    id int auto_increment primary key,
    country_iso varchar(2) not null
);
CREATE TABLE countryCityDetailCodeCurrency
(
    countryId int,
    capitalCityID int,
    largestCityID int,
    countryDetailsID int,
    countryCodeID int,
    countryCurrencyID int,
    CONSTRAINT FK_CountryID_CountriesID FOREIGN KEY (countryID) REFERENCES country_list(id),
    CONSTRAINT FK_CapitalCityID_CitiesID FOREIGN KEY (capitalCityID) REFERENCES city_list(id),
    CONSTRAINT FK_LargestCityID_CitiesID FOREIGN KEY (largestCityID) REFERENCES city_list(id),
    CONSTRAINT FK_CountryDetailsID_Country_DetailID FOREIGN KEY (countryDetailsID) REFERENCES country_details(id),
    CONSTRAINT FK_CountryCodeID_Country_CodeID FOREIGN KEY (countryCodeID) REFERENCES country_codes(id),
    CONSTRAINT FK_CountryCurrencyID_CurrenciesID FOREIGN KEY (countryCurrencyID) REFERENCES currencies(id)
);
CREATE TABLE IF NOT EXISTS top_level_domains_countries
(
    top_level_domainID int,
    countryID int,
    CONSTRAINT FK_TopLevelDomain_TopLevelDomainsID FOREIGN KEY (top_level_domainID) REFERENCES top_level_domains(id),
    CONSTRAINT FK_TopLevelCountryID_CountriesID FOREIGN KEY (countryID) REFERENCES country_list(id)
);

/*Daten in die Tabellen einfügen
Städteliste*/
INSERT INTO city_list
(
    city_name
)
VALUES
    ('Wien'),
    ('Bruxelles'),
    ('Praha'),
    ('Paris'),
    ('Berlin'),
    ('Roma'),
    ('Vaduz'),
    ('Schaan'),
    ('Madrid'),
    ('Stockholm'),
    ('Bern'),
    ('Zurich'),
    ('Ankara'),
    ('Istanbul'),
    ('London'),
    ('Washington, D.C.'),
    ('New York City'),
    ('Vatican City');

/*Top Level Domains*/
INSERT INTO top_level_domains
(
    top_level_domain
)
VALUES
    ('.at'),
    ('.be'),
    ('.cz'),
    ('.fr'),
    ('.de'),
    ('.eu'),
    ('.it'),
    ('.li'),
    ('.es'),
    ('.se'),
    ('.ch'),
    ('.swiss'),
    ('.tr'),
    ('.uk'),
    ('.us'),
    ('.va');

/*Währungsliste*/
INSERT INTO currencies(
    currency_iso,
    currency_name
)
VALUES
    ('EUR','Euro'),
    ('CZK','Czech Koruna'),
    ('CHF','Swiss Franc'),
    ('SEK','Swedish Krona'),
    ('TRY','Turkish Lira'),
    ('GBP','Pound Sterling'),
    ('USD','United States Dollar');

/*Länderliste*/
INSERT INTO country_list
(
    geographical_name,
    official_name
)
VALUES
    ('Austria','Republic of Austria'),
    ('Belgium','Kingdom of Belgium'),
    ('Czechia','Czech Republic'),
    ('France','French Republic'),
    ('Germany','Federal Republic of Germany'),
    ('Italy','Italin Republic'),
    ('Lichtenstein','Principality of Liechtenstein'),
    ('Spain','Kingdom of Spain'),
    ('Sweden','Kingdom of Sweden'),
    ('Switzerland','Swiss Confederation'),
    ('Turkey','Republic of Turkey'),
    ('United Kingdom','United Kingdom of Great Britain and Northern Ireland'),
    ('United States','Unitede States of America'),
    ('Vatican City','Vatican City State');

/*Details über die Länder*/
INSERT INTO country_details (
    country_area,
    country_population,
    country_prefix
)
VALUES
    (83871,8898457,'+43'),
    (30528,11505732,'+32'),
    (78856,10668641,'+420'),
    (640679,67081000,'+33'),
    (357114,83073100,'+49'),
    (301339,60252824,'+39'),
    (160,38557,'+423'),
    (505992,46934632,'+34'),
    (450295,10319601,'+46'),
    (41284,8586550,'+41'),
    (783562,82003882,'+90'),
    (242495,66435600,'+44'),
    (9525067,330523816,'+1'),
    (0,799,'+379');

/*Ländercodes mit Referenz zu Währung und Länderliste*/
INSERT INTO country_codes (
    country_iso
)
VALUES
    ('AT'),
    ('BE'),
    ('CZ'),
    ('FR'),
    ('DE'),
    ('IT'),
    ('LI'),
    ('ES'),
    ('SE'),
    ('CH'),
    ('TR'),
    ('GB'),
    ('US'),
    ('VA');

/*Normalisierte Tabelle für die Country, City, Detail, ISO und Währungsdaten*/
INSERT INTO countryCityDetailCodeCurrency
(
    countryID,
    capitalCityID,
    largestCityID,
    countryDetailsID,
    countryCodeID,
    countryCurrencyID
)
VALUES
    (1,1,1,1,1,1),
    (2,2,2,2,2,1),
    (3,3,3,2,3,2),
    (4,4,4,4,4,1),
    (5,5,5,5,5,1),
    (6,6,6,6,6,1),
    (7,7,8,7,7,3),
    (8,9,9,8,8,1),
    (9,10,10,9,9,4),
    (10,11,12,10,10,3),
    (11,13,14,11,11,5),
    (12,15,15,12,12,6),
    (13,16,17,13,13,7),
    (14,18,18,14,14,1);

/*Referenztabelle zu Domains und CodeListe*/
INSERT INTO top_level_domains_countries
(
    top_level_domainID,
    countryID
)
VALUES
    (1,1),
    (2,2),
    (3,3),
    (4,4),
    (5,5),
    (6,5),
    (7,6),
    (8,7),
    (9,8),
    (10,9),
    (11,10),
    (12,10),
    (13,11),
    (14,12),
    (15,13),
    (15,14);