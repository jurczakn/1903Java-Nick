"use strict";
//classes create templates for objects
//in angular classes are used for components, services, directives, pipes, and more
exports.__esModule = true;
var Wrestler = /** @class */ (function () {
    function Wrestler(stageName, signatureMove) {
        this.stageName = stageName;
        this.signatureMove = signatureMove;
    }
    Wrestler.prototype.celebrate = function () {
        return 'Look at ' +
            this.stageName + ' dance after doing his ' +
            this.finishingMove;
    };
    Wrestler.prototype.getRealName = function () {
        return this.realName;
    };
    Wrestler.getMood = function () {
        return "fired up";
    };
    return Wrestler;
}());
exports.Wrestler = Wrestler;
var sting = new Wrestler("Sting", 'baseball bat');
exports.stoneCold = new Wrestler("Stone Cold Steve Austin", "Stone Cold Stunner");
sting.weight = 250;
exports.stoneCold.getRealName();
Wrestler.getMood();
//stoneCold.getMood();
//stoneCold.pet = "fluffy";
