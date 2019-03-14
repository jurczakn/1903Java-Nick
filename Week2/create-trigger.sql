select * from employee;
insert into employee 
(employeeid, firstname, lastname) 
values (10, 'Damani', 'O');

create sequence employee_id_seq start 11;
commit;
select last_value from employee_id_seq;

insert into employee
(employeeid, firstname, lastname)
values ((select nextval('employee_id_seq')),
'Matthew', 'J');

create or replace 
function insert_into_employee()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
		new.employeeid = (select nextval('employee_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;

create trigger employee_insert
	before insert on employee
	for each row
	execute procedure  insert_into_employee();
	
insert into employee 
(employeeid, firstname, lastname)
values (1, 'Chris', 'R');

insert into employee
(firstname, lastname)
values ('Josh', 'H');