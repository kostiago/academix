-- INSERINDO "USUARIOS" na tabela tb_user
INSERT INTO tb_user(name, email, password) VALUES ('Alex', 'alex.alex@mail.com', 1234);
INSERT INTO tb_user(name, email, password) VALUES ('Pedro Neto', 'neto.pedro@mail.com', 1234);
INSERT INTO tb_user(name, email, password) VALUES ('Edna', 'edna.polaroid@mail.com', 1234);

-- INSERINDO "CARGOS" na tabela tb_role
INSERT INTO tb_role(authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role(authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role(authority) VALUES ('ROLE_ADMIN');

-- INSERINDO "USUARIOS COM CARGOS" na tabela tb_user_ROLE
INSERT INTO tb_user_role(user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2, 3);
INSERT INTO tb_user_role(user_id, role_id) VALUES (3, 2);

-- INSERINDO "IMAGEM" na tabela tb_course_img
INSERT INTO tb_course_img (name) VALUES ('https://embarcados.com.br/wp-content/uploads/2014/03/imagem-de-destaque-28-850x510.png');

-- INSERINDO "CURSO" na tabela tb_course
INSERT INTO tb_course(name, course_img_id) VALUES ('Desenvolvimento back-end com Java', 1);

-- INSERINDO "NOTIFICAÇÕES" na tabela tb_notification
INSERT INTO tb_notification(text, moment, read, route, user_id) VALUES ('Desenvolvimento back-end com Java', NOW(), false, '/welcome',1);

-- INSERINDO "OFERTA" na tabela tb_offer
INSERT INTO tb_offer(edition, start_Moment, end_Moment, course_id) VALUES(1.0, NOW(), NOW(), 1);

-- INSERINDO "RECURSOS/TRILHAS" na tabela tb_resource
INSERT INTO tb_resource(title, description, position, course_img_id, type, offer_id) VALUES ('Trilha Java', 'Aprenda do basico ao avançado em java', 1, 1, 1, 1);
INSERT INTO tb_resource(title, description, position, course_img_id, type, offer_id) VALUES ('Forum', 'Tire suas duvidas', 2, 1, 2, 1);
INSERT INTO tb_resource(title, description, position, course_img_id, type, offer_id) VALUES ('Avaliações', 'Teste seu conhecimento com provas do basico ao avançado', 3, 1, 0, 1);

-- INSERINDO "SEÇÕES" na tabela tb_section
INSERT INTO tb_section(title, description, position, course_img_id, resource_id, prerequisite_id) VALUES ('Java básico', 'Conheça os fundamentos do java e sua sintaxe', 1, 1, 1, null);
INSERT INTO tb_section(title, description, position, course_img_id, resource_id, prerequisite_id) VALUES ('Avaliação Java basico ', 'Teste seu conhecimento nessa avaliação', 1, 1, 3, null);

-- INSERINDO "MATRICULAS" na tabela tb_enrollment
INSERT INTO tb_enrollment(user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (1, 1, NOW(), NOW(), true, false);

-- INSERINDO "AGENDA" na tabela tb_schedule
INSERT INTO tb_schedule (date, description, type, course_id) VALUES (NOW(), 'Aula 1: Introdução à JVM', 1, 1);

-- INSERINDO "LIÇÕES" na tabela tb_lesson
INSERT INTO tb_lesson(title, position, section_id) VALUES ('Noções de POO', 1, 1);
INSERT INTO tb_lesson(title, position, section_id) VALUES ('Noções de POO 2', 2, 1);
INSERT INTO tb_lesson(title, position, section_id) VALUES ('Noções de POO 3', 3, 1);
INSERT INTO tb_lesson(title, position, section_id, schedule_id) VALUES ('Tarefa do capitulo 1', 4, 1, 1);

-- INSERINDO "CONTEUDO -> VIDEO" na tabela tb_content
INSERT INTO tb_content(id, text_Content, video_Uri) VALUES(1, 'Material de apoio: POO', 'https://www.youtube.com/watch?v=dq73as9J2xA');
INSERT INTO tb_content(id, text_Content, video_Uri) VALUES(2, '', 'https://www.youtube.com/watch?v=dq73as9J2xA');
INSERT INTO tb_content(id, text_Content, video_Uri) VALUES(3, 'Material de apoio: POO', 'https://www.youtube.com/watch?v=dq73as9J2xA');

-- INSERINDO "CONTEUDO -> ATIVIDADE" na tabela tb_task
INSERT INTO tb_task(id, description, question_Count, approval_Count, weight, due_Date) VALUES(4, 'Exercicio para fixação de conteudo', 10, 7, 10, NOW());

-- INSERINDO "LIÇÕES CONCLUIDAS" na tabela tb_lessons_done
INSERT INTO tb_lessons_done(lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done(lesson_id, user_id, offer_id) VALUES (2, 1, 1);

-- INSERINDO "ENTREGAS ATVIDADE" na tabela tb_deliver
INSERT INTO tb_deliver (uri, moment, status, feedback, correct_Count, lesson_id, user_id, offer_id) VALUES ('https://github.com/kostiago/virtual-marketplace/tree/developer', NOW(), 2, NULL, 4, 1, 1,1);

-- INSERINDO "TOPICOS" na tabela tb_topic
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Topico 1', 'Aqui já o corpo de tudo aquilo que o topico 1 precisa', NOW(), 1, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Topico 2', 'Aqui já o corpo de tudo aquilo que o topico 2 precisa', NOW(), 2, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Topico 3', 'Aqui já o corpo de tudo aquilo que o topico 3 precisa', NOW(), 3, 1, 1);

-- INSERINDO "CURTIDAS EM TOPICOS" na tabela tb_topic_likes
INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (1, 1);
INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (2, 1);
INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (3, 1);

-- INSERINDO "RESPOSTA A TOPICOS" na tabela tb_reply
INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Resposta para o topico 1', NOW(), 1, 2);

-- INSERINDO "CURTIDAS EM RESPOSTA" na tabela tb_reply_likes
INSERT INTO tb_reply_likes (reply_id, user_id) VALUES (1,1);

-- INSERINDO "USUARIOS E AGENDAS" na tabela tb_schedule_user
INSERT INTO tb_schedule_user (schedule_id, user_id) VALUES (1, 1);

-- INSERINDO "CERTIFICADO" na tabela tb_certificate
INSERT INTO tb_certificate (issue_Date, certification_Link, course_Name, issuer_Name, issuer_Cnpj, status, course_id) VALUES ( NOW(), 'https://link-do-certificado.com/12345', 'Marketing Integrado para Pequenas Empresas', 'Agência Pense S.A', '00.000.000/0000-00', 1, 1)
