create or replace function my_sum(val_a bigint, val_b bigint)
returns integer as $$
begin
	return val_a + val_b;
end;
$$ language plpgsql;

select my_sum(5, 6);

create or replace function employeeCount()
returns integer as $$
declare
	total integer;
begin
	select count(employeeid) into total from employee;
	return total;
end;
$$ language plpgsql;

select employeeCount();

create or replace function new_stored_proc(inout ret_val bigint)
as $$
begin
	select count(*) into ret_val from employee;
end;
$$ language plpgsql;

create or replace function get_emps(in e_id int, inout curs refcursor)
as $$
begin
	open curs for select lastname, firstname from employee
	where employeeid < e_id;
end;
$$ language plpgsql;

create table proc_table(
firstname text,
lastname text
)

select * from proc_table;

commit;

do $$
declare
	curs refcursor;
	firstname text;
	lastname text;
begin
	select get_emps(6, curs) into curs;
	loop
		fetch curs into firstname, lastname;
		exit when not found;
		
		insert into proc_table (firstname, lastname)
		values(firstname, lastname);
	end loop;
end;
$$ language plpgsql;

select * from proc_table;
