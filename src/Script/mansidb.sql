--
-- PostgreSQL database dump
--

\restrict B3orpx7AehEKhuzAbVP5pgPlTGoxYalt4BmbUm5TiXT9OQqPw8gFTlj1nhJwPCL

-- Dumped from database version 17.6 (Ubuntu 17.6-1.pgdg24.04+1)
-- Dumped by pg_dump version 17.6 (Ubuntu 17.6-1.pgdg24.04+1)

-- Started on 2025-09-18 14:38:56 IST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 16392)
-- Name: employee; Type: TABLE; Schema: public; Owner: mansi
--

CREATE TABLE public.employee (
    id integer NOT NULL,
    name character varying(50),
    role character varying(50)
);


ALTER TABLE public.employee OWNER TO mansi;

--
-- TOC entry 217 (class 1259 OID 16391)
-- Name: employee_id_seq; Type: SEQUENCE; Schema: public; Owner: mansi
--

CREATE SEQUENCE public.employee_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.employee_id_seq OWNER TO mansi;

--
-- TOC entry 3445 (class 0 OID 0)
-- Dependencies: 217
-- Name: employee_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: mansi
--

ALTER SEQUENCE public.employee_id_seq OWNED BY public.employee.id;


--
-- TOC entry 3290 (class 2604 OID 16395)
-- Name: employee id; Type: DEFAULT; Schema: public; Owner: mansi
--

ALTER TABLE ONLY public.employee ALTER COLUMN id SET DEFAULT nextval('public.employee_id_seq'::regclass);


--
-- TOC entry 3439 (class 0 OID 16392)
-- Dependencies: 218
-- Data for Name: employee; Type: TABLE DATA; Schema: public; Owner: mansi
--

COPY public.employee (id, name, role) FROM stdin;
1	Mansi Thakkar	Developer
2	Garima Chaudhary	HR Executive
\.


--
-- TOC entry 3446 (class 0 OID 0)
-- Dependencies: 217
-- Name: employee_id_seq; Type: SEQUENCE SET; Schema: public; Owner: mansi
--

SELECT pg_catalog.setval('public.employee_id_seq', 2, true);


--
-- TOC entry 3292 (class 2606 OID 16397)
-- Name: employee employee_pkey; Type: CONSTRAINT; Schema: public; Owner: mansi
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (id);


-- Completed on 2025-09-18 14:38:56 IST

--
-- PostgreSQL database dump complete
--

\unrestrict B3orpx7AehEKhuzAbVP5pgPlTGoxYalt4BmbUm5TiXT9OQqPw8gFTlj1nhJwPCL

