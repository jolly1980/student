export interface IStudent {
    id?: number;
    matrikelnummer?: number;
    nachnahme?: string;
    vorname?: string;
    strasse?: string;
    plz?: number;
    ort?: string;
}

export class Student implements IStudent {
    constructor(
        public id?: number,
        public matrikelnummer?: number,
        public nachnahme?: string,
        public vorname?: string,
        public strasse?: string,
        public plz?: number,
        public ort?: string
    ) {}
}
