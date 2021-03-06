/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2018 Spooky Games
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.spookygames.gdx.gameservices.playtomic;

import net.spookygames.gdx.gameservices.achievement.Achievement;
import net.spookygames.gdx.gameservices.achievement.AchievementState;

public class PlaytomicAchievement implements Achievement {

	private String achievement;
	private String achievementkey;
	private String achievementid;
	private PlaytomicPlayer player;

	public PlaytomicAchievement() {
	}

	@Override
	public String getId() {
		return achievementkey;
	}

	@Override
	public String getName() {
		return achievement;
	}

	public String getAchievementid() {
		return achievementid;
	}

	public PlaytomicPlayer getPlayer() {
		return player;
	}

	@Override
	public AchievementState getState() {
		return AchievementState.Unlocked;
	}

	@Override
	public String toString() {
		return "PlaytomicAchievement [id=" + getId() + ", name=" + getName() + "]";
	}

}