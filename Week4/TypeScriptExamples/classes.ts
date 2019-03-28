//classes create templates for objects
//in angular classes are used for components, services, directives, pipes, and more

import {finisher} from './interfaces';

export class Wrestler implements finisher{

    finishingMove: string;

    celebrate(): string {
        return 'Look at ' + 
        this.stageName + ' dance after doing his ' + 
        this.finishingMove;
    }

    introSong: string;

    stageName: string;
    //^^^^---- public property
    //vvvv---- access modifer
    private realName: string;

    signatureMove: string;

    age: number;

    weight: number;

    winLoseRatio: number;

    constructor(stageName: string, signatureMove: string){
        this.stageName = stageName;
        this.signatureMove = signatureMove;
    }

    public getRealName(): string{
        return this.realName;
    }

    static getMood(): string {
        return `fired up`;
    }

}

let sting = new Wrestler(`Sting`, 'baseball bat');
export let stoneCold = new Wrestler(`Stone Cold Steve Austin`, `Stone Cold Stunner`);
sting.weight=250;
stoneCold.getRealName();
Wrestler.getMood();
//stoneCold.getMood();

//stoneCold.pet = "fluffy";