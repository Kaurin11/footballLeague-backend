insert into  nationality (id, name)
values (1, 'Brasilian'),
       (2, 'Serbian'),
       (3, 'France'),
       (4, 'Espania');

insert into  league (id, name)
values (1, 'Primera Espania'),
       (2, 'Premier League England'),
       (3, 'Bundes Germany'),
       (4, 'League One France');

insert into  team (id, name, founded, league_id)
values (1, 'Atletico Madrid', '1874-01-01',1 ),
       (2, 'Barcelona' , '1899-01-01', 1),
       (3, 'Chelsea', '1890-12-12', 2),
       (4, 'Leeds', '1880-02-03', 2),
       (5, 'Borusia Dortmund', '1901-01-05', 3),
       (6, 'Psg', '1970-07-09',4);

insert into  player (id, firstName, lastName, registrationNumber, birthday, nationality_id,team_id)
values (1, 'Diego', 'Costa' , '1212', '1974-01-01',1,1),
       (2, 'Samiuel', 'Umtiti' , '0012', '1982-03-06',3,2),
       (3, 'Serhio', 'Rico' , '1582', '1986-01-09',4,5);