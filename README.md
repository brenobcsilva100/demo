use escola

create table professor(
id int primary key auto_increment,
nome varchar(50),
sobrenome varchar(50),
materia varchar(50),
datahora timestamp default current_timestamp);


Date data = new Date();
DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT)
formatador.format(data.toString());