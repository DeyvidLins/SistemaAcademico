--CREATE TABLE Curso(Cd_Curso integer  not null,
--				   Nm_curso VARCHAR (40) NOT NULL,
--                  Periodo int not null,            
--                  turma varchar(10) not null,
--				   turno char(05) not null,
--                    primary key (Cd_Curso));


--CREATE TABLE Aluno (Cd_Curso integer,
--                   matricula integer identity(2018207602,1),
--				   nome VARCHAR (50)not null,
--				    DataNascimento VARCHAR(10) not null,
--				    cpf char(15) NOT NULL,
--				   rg char(15) NOT NULL,
--				   estado char(2) NOT NULL,
--				   estacivil char(10) NOT NULL,
--				   cidade char(30) NOT NULL,
--				   sexo char(1) CONSTRAINT sexo_ CHECK (sexo in ('M', 'F')) NOT NULL,
--				   telefone varchar(15) NOT NULL,
--               constraint PK_mat primary key (matricula),
--				   foreign key(cd_curso) REFERENCES Curso );

--create table DisciplinaEspecifica(Cd_Disciplina integer not null,
--                             cd_curso integer ,
--                           Nm_Disciplina varchar(40) not null,
--						  Turma char(10) not null,
--						  turno char(05) not null,
--						  primary key (Cd_Disciplina),
--                          foreign key (Cd_curso) references curso);

--create table Nota ( nota1 float  ,
--                    --nota2 float ,
--					cd_disciplina integer not null,
--					matricula integer not null,
--					foreign key (Cd_disciplina) references disciplinaespecifica,
--					foreign key (matricula) references aluno);
					 

--UPDATE disciplinaespecifica SET Cd_curso = 59 WHERE Nm_disciplina = 'poo'
   
				--update nota set nota1 =5 where matricula = '2018207602'

				select * from DisciplinaEspecifica