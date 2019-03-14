create table test_table (
	col_1 integer,
	col_2 text
)

select * from test_table;

insert into test_table values(5);

insert into test_table (col_2) values('my new value');

insert into test_table (col_1, col_2) values(20, 'next value');

select name from artist;

select * from album;

select * from artist where name = 'AC/DC';

select * from album where artistid = 1;

select * from track where albumid = 1 or albumid = 4;

select * from track where albumid in (
	select albumid from album where artistid = (
		select artistid from artist where name = 'AC/DC'));
		
select * from playlist where playlistid = (
	select playlistid from playlisttrack where trackid = (
		select trackid from track where albumid = (
			select albumid from album where artistid = (
				select artistid from artist where name = 'AC/DC')) ));
		
select albumid from album where artistid = (
	select artistid from artist where name = 'AC/DC');